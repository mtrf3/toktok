package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;

/* renamed from: X.5L3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5L3 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ EditorProContext LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5L3(VideoPublishEditModel videoPublishEditModel, EditorProContext editorProContext, String str, String str2) {
        super(0);
        this.LJLIL = editorProContext;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        int i = 0;
        OSZ LIZJ = C124934vJ.LIZJ(C79057V0z.LJJI(this.LJLIL), false);
        int intValue = ((Number) LIZJ.getFirst()).intValue();
        int intValue2 = ((Number) LIZJ.getSecond()).intValue();
        C145995oB LJFF = C5QW.LJFF(this.LJLILLLLZI, this.LJLIL);
        LJFF.LJI("tab_name", this.LJLJI);
        LJFF.LJI("enter_method", this.LJLJJI);
        LJFF.LJI("enter_from", this.LJLILLLLZI.enterFrom);
        LJFF.LJI("shoot_way", this.LJLILLLLZI.mShootWay);
        LJFF.LJI("content_source", H8F.LJI(this.LJLILLLLZI));
        LJFF.LJI("content_type", H8F.LJII(this.LJLILLLLZI));
        LJFF.LIZIZ(this.LJLIL.getPlayer().s5(), "creation_duration");
        LJFF.LJI("creation_id", this.LJLILLLLZI.getCreationId());
        LJFF.LJI("music_selected_from", this.LJLILLLLZI.getMusicOriginWithCheck());
        if (intValue + intValue2 > 1) {
            i = 1;
        }
        LJFF.LIZ(i, "is_multi_content");
        LJFF.LIZ(intValue, "video_cnt");
        LJFF.LIZ(intValue2, "pic_cnt");
        if (this.LJLILLLLZI.mDraftToEditFrom == 0) {
            LJFF.LIZLLL("draft_way", "general_draft_list");
        }
        FMX.LJIIL("edit_panel_show", LJFF.LIZ);
        return C76800UCe.LIZ;
    }
}
