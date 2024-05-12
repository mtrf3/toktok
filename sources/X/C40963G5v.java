package X;

import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import java.util.ArrayList;

/* renamed from: X.G5v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40963G5v implements GKY {
    public final /* synthetic */ VideoPublishContainerScene LIZ;

    @Override // X.GKY
    public final void LIZLLL() {
    }

    @Override // X.GKY
    public final void LJ(boolean z) {
    }

    public C40963G5v(VideoPublishContainerScene videoPublishContainerScene) {
        this.LIZ = videoPublishContainerScene;
    }

    @Override // X.GKY
    public final void LIZ(ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
        PUgcTemplateData pUgcTemplateData = this.LIZ.LLILZLL.creativeModel.pugcTemplateData;
        pUgcTemplateData.canPostTemplate = true;
        pUgcTemplateData.fixedSlots = arrayList;
        pUgcTemplateData.getClass();
        pUgcTemplateData.fixedSlotIndex = arrayList2;
        this.LIZ.c();
    }

    @Override // X.GKY
    public final void LIZJ(ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
        PUgcTemplateData pUgcTemplateData = this.LIZ.LLILZLL.creativeModel.pugcTemplateData;
        pUgcTemplateData.getClass();
        pUgcTemplateData.fixedSlots = arrayList;
        PUgcTemplateData pUgcTemplateData2 = this.LIZ.LLILZLL.creativeModel.pugcTemplateData;
        pUgcTemplateData2.getClass();
        pUgcTemplateData2.fixedSlotIndex = arrayList2;
    }

    @Override // X.GKY
    public final void LIZIZ(int i, String str, boolean z) {
        String str2;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LLILZLL.getCreationId());
        c145995oB.LJI("enter_from", "video_post_page");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("status", str2);
        c145995oB.LJI("shoot_way", this.LIZ.LLILZLL.mShootWay);
        c145995oB.LIZ(i, "rank");
        c145995oB.LJI("duration", str);
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(this.LIZ.LLILZLL));
        FMX.LJIIL("choose_non_replaceable_content", c145995oB.LIZ);
    }
}
