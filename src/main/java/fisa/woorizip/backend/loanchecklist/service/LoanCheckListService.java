package fisa.woorizip.backend.loanchecklist.service;

import fisa.woorizip.backend.loanchecklist.dto.request.LoanChecklistFilterRequest;
import fisa.woorizip.backend.loangoods.dto.response.LoanGoodsResponse;

import java.util.List;

public interface LoanCheckListService {

    List<LoanGoodsResponse> getRecommendLoanGoods(
            Long houseId, LoanChecklistFilterRequest loanGoodsCheckListRequest);
}
