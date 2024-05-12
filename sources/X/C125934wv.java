package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;

/* renamed from: X.4wv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125934wv extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ VideoPublishEditModel LJLIL;
    public final /* synthetic */ EditorProContext LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C125934wv(VideoPublishEditModel videoPublishEditModel, EditorProContext editorProContext, String str, boolean z) {
        super(0);
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = editorProContext;
        this.LJLJI = str;
        this.LJLJJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C145995oB LJFF = C5QW.LJFF(this.LJLIL, this.LJLILLLLZI);
        LJFF.LJI("crop_type", this.LJLJI);
        LJFF.LIZ(this.LJLJJI ? 1 : 0, "is_cropped");
        FMX.LJIIL("save_crop_video", LJFF.LIZ);
        return C76800UCe.LIZ;
    }
}
