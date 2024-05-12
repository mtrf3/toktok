package X;

import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessEndResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessSummaryResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWordlistResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.GuessResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.StartDrawGuessResponse;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.interaction.pictionary.PictionaryRankResponse;
import webcast.api.interaction.pictionary.ReviewWordResponse;

/* loaded from: classes6.dex */
public final class BFL implements DrawGuessApi {
    public final DataChannel LIZ;
    public long LIZIZ = 1;
    public long LIZJ = 1;
    public final List<PictionaryFullInfo> LIZLLL = new ArrayList();

    public BFL(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
    public final AbstractC73672Svk<C28467BFf<DrawGuessWordlistResponse>> getWordList(long j) {
        if (C29306Beo.LJJII(this.LIZ)) {
            return getMockWordList(j, C29306Beo.LJJIJ(this.LIZ));
        }
        return ((DrawGuessApi) Q7L.LIZIZ(DrawGuessApi.class)).getWordList(j);
    }

    @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
    public final AbstractC73638SvC<C28467BFf<CoverImageModel>> uploadImage(TypedOutput typedOutput) {
        o.LJIIIZ(typedOutput, "typedOutput");
        return AbstractC73638SvC.LJIILJJIL(new BFM());
    }

    @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
    public final AbstractC73672Svk<C28467BFf<DrawGuessWordlistResponse>> getMockWordList(long j, long j2) {
        return ((DrawGuessApi) Q7L.LIZIZ(DrawGuessApi.class)).getMockWordList(j, j2);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessSummaryResponse, T] */
    @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
    public final AbstractC73672Svk<C28467BFf<DrawGuessSummaryResponse>> getSummaryData(long j, long j2) {
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = new DrawGuessSummaryResponse(null, 1, null);
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, webcast.api.interaction.pictionary.ReviewWordResponse$ResponseData] */
    @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
    public final AbstractC73672Svk<C28467BFf<ReviewWordResponse.ResponseData>> reviewWord(long j, String word) {
        o.LJIIIZ(word, "word");
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = new ReviewWordResponse.ResponseData();
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.bytedance.android.livesdk.interaction.drawguess.network.GuessResponse] */
    @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
    public final AbstractC73672Svk<C28467BFf<GuessResponse>> guessWord(long j, long j2, String comment) {
        o.LJIIIZ(comment, "comment");
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = new GuessResponse(true, "");
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessEndResponse, T] */
    @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
    public final AbstractC73672Svk<C28467BFf<DrawGuessEndResponse>> endDrawGuessGameRound(long j, long j2, String imageUri, int i) {
        o.LJIIIZ(imageUri, "imageUri");
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = new DrawGuessEndResponse(new PictionaryStatistics(0L, 0L, null));
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessSummaryResponse, T] */
    @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
    public final AbstractC73672Svk<C28467BFf<DrawGuessSummaryResponse>> exitDrawGuessGame(long j, long j2, long j3, String drawUri) {
        o.LJIIIZ(drawUri, "drawUri");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZLLL);
        ((ArrayList) this.LIZLLL).clear();
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = new DrawGuessSummaryResponse(arrayList);
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, webcast.api.interaction.pictionary.PictionaryRankResponse$ResponseData] */
    @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
    public final AbstractC73672Svk<C28467BFf<PictionaryRankResponse.ResponseData>> getRoundSummaryData(long j, long j2, long j3, long j4) {
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = new PictionaryRankResponse.ResponseData();
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
    public final AbstractC73672Svk<C28467BFf<StartDrawGuessResponse>> startDrawGuess(long j, long j2, long j3, String word, int i) {
        T t;
        o.LJIIIZ(word, "word");
        if (i == 2) {
            t = new StartDrawGuessResponse(1L, 1L);
        } else {
            if (j2 == 0) {
                this.LIZJ++;
                this.LIZIZ++;
            } else {
                this.LIZIZ++;
            }
            t = new StartDrawGuessResponse(this.LIZIZ, this.LIZJ);
        }
        List<PictionaryFullInfo> list = this.LIZLLL;
        PictionaryInfo pictionaryInfo = new PictionaryInfo();
        pictionaryInfo.word = word;
        pictionaryInfo.id = j3;
        pictionaryInfo.pictionaryType = i;
        pictionaryInfo.sessionId = j2;
        ((ArrayList) list).add(new PictionaryFullInfo(pictionaryInfo, null, false, 6, null));
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = t;
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }
}
