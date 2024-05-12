package X;

import android.content.Intent;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMediaForVideo2Sticker$1$1", f = "CutOptimizedVideoChosenHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5WI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C43544H7c LJLIL;
    public final /* synthetic */ Intent LJLILLLLZI;
    public final /* synthetic */ ArrayList<VideoSegment> LJLJI;
    public final /* synthetic */ List<ImportVideoInfo> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5WI(C43544H7c c43544H7c, Intent intent, ArrayList<VideoSegment> arrayList, List<ImportVideoInfo> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C5WI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c43544H7c;
        this.LJLILLLLZI = intent;
        this.LJLJI = arrayList;
        this.LJLJJI = list;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5WI(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C43544H7c c43544H7c = this.LJLIL;
        Intent intent = this.LJLILLLLZI;
        ArrayList<VideoSegment> arrayList = this.LJLJI;
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(this.LJLJJI);
        c43544H7c.getClass();
        Workspace LIZ = HU5.LIZ(C77412UZs.LJIJI(intent));
        EditPreviewInfo LIZ2 = C6ZR.LIZ(true, LIZ, arrayList, new long[]{-1, -1});
        intent.putExtra("workspace", LIZ);
        intent.putExtra("extra_av_is_fast_import", true);
        intent.putExtra("extra_edit_preview_info", (Parcelable) LIZ2);
        if (!arrayList2.isEmpty()) {
            intent.putParcelableArrayListExtra("extra_import_video_info_list", arrayList2);
        }
        C16880lQ.LIZIZ(c43544H7c.LIZ, intent);
        this.LJLJJL.invoke();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
