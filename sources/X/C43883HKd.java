package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.HKd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43883HKd extends AbstractC65781Prl implements InterfaceC88472Yns<C145995oB, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ AbstractC46064I6a LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43883HKd(boolean z, AbstractC46064I6a abstractC46064I6a, long j) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = abstractC46064I6a;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C145995oB c145995oB) {
        String str;
        String str2;
        C145995oB editAdjustMobEvent = c145995oB;
        o.LJIIIZ(editAdjustMobEvent, "$this$editAdjustMobEvent");
        editAdjustMobEvent.LIZ(this.LJLIL ? 1 : 0, "is_edit");
        editAdjustMobEvent.LIZ(H8F.LJIIL(this.LJLILLLLZI.LJLIIL()), "is_multi_content");
        editAdjustMobEvent.LIZ(this.LJLILLLLZI.LJLIIL().videoCount, "video_cnt");
        editAdjustMobEvent.LIZ(this.LJLILLLLZI.LJLIIL().photoCount, "pic_cnt");
        editAdjustMobEvent.LIZIZ(this.LJLJI, "edit_duration");
        editAdjustMobEvent.LIZLLL("mix_type", H8F.LJIIJ(this.LJLILLLLZI.LJLIIL()));
        Iterator<VideoSegment> it = this.LJLILLLLZI.LJJLL().LJII().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().duration;
        }
        editAdjustMobEvent.LIZIZ(j, "content_duration_ms");
        editAdjustMobEvent.LIZLLL("music_id", this.LJLILLLLZI.LJLIIL().getMusicId());
        if (this.LJLILLLLZI.LJLIIL().editMusicSyncMode) {
            str = "sync_on";
        } else {
            str = "sync_off";
        }
        editAdjustMobEvent.LIZLLL("sync_mode", str);
        if (H7R.LJIIL(this.LJLILLLLZI.LJLIIL()) && this.LJLILLLLZI.LLLJIL()) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        editAdjustMobEvent.LIZLLL("smart_sync", str2);
        editAdjustMobEvent.LIZLLL("music_selected_from", this.LJLILLLLZI.LJLIIL().getMusicOriginWithCheck());
        editAdjustMobEvent.LIZ(this.LJLILLLLZI.LJZ ? 1 : 0, "is_rotated");
        editAdjustMobEvent.LIZ(this.LJLILLLLZI.LJZI ? 1 : 0, "is_edit_speed");
        editAdjustMobEvent.LIZ(this.LJLILLLLZI.LJZL ? 1 : 0, "is_adjusted");
        return C76800UCe.LIZ;
    }
}
