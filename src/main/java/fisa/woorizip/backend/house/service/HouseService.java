package fisa.woorizip.backend.house.service;

import fisa.woorizip.backend.house.dto.request.MapFilterRequest;
import fisa.woorizip.backend.house.dto.response.HouseDetailResponse;
import fisa.woorizip.backend.house.dto.response.ShowMapResponse;
import fisa.woorizip.backend.member.controller.auth.MemberIdentity;

public interface HouseService {
    HouseDetailResponse getHouseDetail(Long houseId);

    ShowMapResponse showMap(MapFilterRequest mapFilterRequest, MemberIdentity memberIdentity);
}
