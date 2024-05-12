package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.retrofit2.mime.TypedOutput;
import webcast.api.interaction.pictionary.PictionaryRankResponse;
import webcast.api.interaction.pictionary.ReviewWordResponse;

/* loaded from: classes6.dex */
public interface DrawGuessApi {
    @E8M("/webcast/room/pictionary/end/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<DrawGuessEndResponse>> endDrawGuessGameRound(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("pictionary_id") long j2, @InterfaceC64985Pev("draw_uri") String str, @InterfaceC64985Pev("end_type") int i);

    @E8M("/webcast/room/pictionary/exit/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<DrawGuessSummaryResponse>> exitDrawGuessGame(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("session_id") long j2, @InterfaceC64985Pev("pictionary_id") long j3, @InterfaceC64985Pev("draw_uri") String str);

    @E8L("/webcast/room/pictionary/wordlist/")
    AbstractC73672Svk<C28467BFf<DrawGuessWordlistResponse>> getMockWordList(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("mock_room_id") long j2);

    @E8L("/webcast/room/pictionary/rank/")
    AbstractC73672Svk<C28467BFf<PictionaryRankResponse.ResponseData>> getRoundSummaryData(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("pictionary_id") long j2, @InterfaceC64986Pew("page_offset") long j3, @InterfaceC64986Pew("page_size") long j4);

    @E8L("/webcast/room/pictionary/summary/")
    AbstractC73672Svk<C28467BFf<DrawGuessSummaryResponse>> getSummaryData(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("session_id") long j2);

    @E8L("/webcast/room/pictionary/wordlist/")
    AbstractC73672Svk<C28467BFf<DrawGuessWordlistResponse>> getWordList(@InterfaceC64986Pew("room_id") long j);

    @E8M("/webcast/room/pictionary/guess/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<GuessResponse>> guessWord(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("pictionary_id") long j2, @InterfaceC64985Pev("content") String str);

    @E8M("/webcast/room/pictionary/review_word/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<ReviewWordResponse.ResponseData>> reviewWord(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("word") String str);

    @E8M("/webcast/room/pictionary/start/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<StartDrawGuessResponse>> startDrawGuess(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("session_id") long j2, @InterfaceC64985Pev("word_id") long j3, @InterfaceC64985Pev("word") String str, @InterfaceC64985Pev("pictionary_type") int i);

    @E8M("/webcast/room/upload/image/")
    AbstractC73638SvC<C28467BFf<CoverImageModel>> uploadImage(@InterfaceC195727mC TypedOutput typedOutput);
}
