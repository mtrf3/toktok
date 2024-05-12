package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;

/* renamed from: X.5QY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5QY extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ VideoPublishEditModel LJLIL;
    public final /* synthetic */ EditorProContext LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5QY(VideoPublishEditModel videoPublishEditModel, EditorProContext editorProContext, boolean z, boolean z2) {
        super(0);
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = editorProContext;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        String str2;
        int i;
        C145995oB LJFF = C5QW.LJFF(this.LJLIL, this.LJLILLLLZI);
        if (this.LJLJI) {
            str = "click_button";
        } else {
            str = "click_material";
        }
        LJFF.LJI("enter_method", str);
        if (this.LJLJI) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else if (this.LJLJJI) {
            str2 = "video";
        } else {
            str2 = "pip";
        }
        LJFF.LJI("track_type", str2);
        LJFF.LIZ(this.LJLIL.creativeModel.audioCopyrightDetectModel.getCopyrightClaimShowing() ? 1 : 0, "is_copyright_claim");
        C43881HKb.LIZLLL(EnumC139485dg.SHORT_VIDEO, this.LJLIL.creativeModel.audioCopyrightDetectModel.getDetectScenes(), LJFF, "is_short_video");
        C43881HKb.LIZLLL(EnumC139485dg.ECOMMERCE, this.LJLIL.creativeModel.audioCopyrightDetectModel.getDetectScenes(), LJFF, "is_ecommerce_video");
        if (!C63144OqK.LIZLLL(EnumC139485dg.LONG_VIDEO, this.LJLIL.creativeModel.audioCopyrightDetectModel.getDetectScenes())) {
            if (!C63144OqK.LIZLLL(EnumC139485dg.LONG_VIDEO_NEW, this.LJLIL.creativeModel.audioCopyrightDetectModel.getDetectScenes())) {
                i = 0;
                LJFF.LIZ(i, "is_long_video");
                FMX.LJIIL("click_edit_tab", LJFF.LIZ);
                return C76800UCe.LIZ;
            }
        }
        i = 1;
        LJFF.LIZ(i, "is_long_video");
        FMX.LJIIL("click_edit_tab", LJFF.LIZ);
        return C76800UCe.LIZ;
    }
}
