package X;

import android.util.Size;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HAv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43641HAv implements InterfaceC45485HtB {
    @Override // X.InterfaceC45485HtB
    public final void LIZIZ(ShortVideoContext shortVideoContext, ArrayList arrayList) {
    }

    @Override // X.InterfaceC45485HtB
    public final void LIZJ(ShortVideoContext shortVideoContext, String str, String str2, String str3, int i, int i2, String str4) {
    }

    @Override // X.InterfaceC45485HtB
    public final void LIZLLL(ShortVideoContext shortVideoContext, boolean z) {
    }

    @Override // X.InterfaceC45485HtB
    public final void LJ() {
    }

    @Override // X.InterfaceC45485HtB
    public final void LJI(String str, String str2, String str3, long j, String str4, ArrayList<MyMediaModel> arrayList, boolean z, String str5) {
    }

    @Override // X.InterfaceC45485HtB
    public final void LJIIIIZZ(ShortVideoContext shortVideoContext, long j, long j2) {
    }

    @Override // X.InterfaceC45485HtB
    public final void LJIIJ(ShortVideoContext shortVideoContext) {
    }

    @Override // X.InterfaceC45485HtB
    public final void LJIIJJI(ShortVideoContext shortVideoContext, String str, int i, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4) {
    }

    @Override // X.InterfaceC45485HtB
    public final void LJIIL(ShortVideoContext shortVideoContext, boolean z) {
    }

    @Override // X.InterfaceC45485HtB
    public final void LJFF(ShortVideoContext shortVideoContext, MediaState previewMediaState) {
        o.LJIIIZ(previewMediaState, "previewMediaState");
    }

    @Override // X.InterfaceC45485HtB
    public final void LJII(ShortVideoContext shortVideoContext, MyMediaModel media, String str, String str2) {
        o.LJIIIZ(media, "media");
    }

    @Override // X.InterfaceC45485HtB
    public final void LJIIIZ(ShortVideoContext shortVideoContext, EnumC44979Hl1 enumC44979Hl1, String str, Size size, String str2, int i, Integer num, boolean z, boolean z2, boolean z3, String str3, String str4, int i2, int i3, boolean z4, boolean z5, boolean z6) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_type", "photo");
        c145995oB.LJI("upload_type", "multiple_content");
        FMX.LJIIL("choose_upload_content", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45485HtB
    public final void LIZ(ShortVideoContext shortVideoContext, List list, EnumC44979Hl1 enumC44979Hl1, String str, Size size, String str2, int i, Integer num, boolean z, boolean z2, boolean z3, String str3, String str4, boolean z4, int i2, int i3, boolean z5, boolean z6) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_type", "video");
        c145995oB.LJI("upload_type", "multiple_content");
        FMX.LJIIL("choose_upload_content", c145995oB.LIZ);
    }
}
