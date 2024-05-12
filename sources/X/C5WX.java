package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.vesdk.VEUtils;
import fjb.a;
import ujb.s;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.utils.MediaModelUtils$covert2MediaModel$2", f = "MediaModelUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5WX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super MediaModel>, Object> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5WX(long j, String str, InterfaceC67352kd<? super C5WX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5WX(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        MediaModel mediaModel = new MediaModel(this.LJLIL);
        int i = 1;
        boolean LJIJI = C44694HgQ.LJIJI(this.LJLILLLLZI, true);
        String LJIILL = C44694HgQ.LJIILL(this.LJLILLLLZI, true);
        String[] strArr = C44694HgQ.LJFF;
        int length = strArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (s.LJJJLZIJ(LJIILL, strArr[i2], false)) {
                z = true;
                break;
            }
            i2++;
        }
        long j = 3000;
        if (LJIJI || z) {
            OSZ LJIJJ = C38891fp.LJIJJ(this.LJLILLLLZI);
            mediaModel.duration = 3000L;
            mediaModel.width = ((Number) LJIJJ.getFirst()).intValue();
            mediaModel.height = ((Number) LJIJJ.getSecond()).intValue();
            mediaModel.fileLocalUriPath = this.LJLILLLLZI;
            if (!LJIJI) {
                i = 2;
            }
            mediaModel.type = i;
            return mediaModel;
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.LJLILLLLZI);
        if (videoFileInfo != null) {
            String str = this.LJLILLLLZI;
            long j2 = videoFileInfo.duration;
            if (j2 > 0) {
                j = j2;
            }
            mediaModel.duration = j;
            mediaModel.width = videoFileInfo.width;
            mediaModel.height = videoFileInfo.height;
            mediaModel.fileLocalUriPath = str;
            mediaModel.type = 4;
            return mediaModel;
        }
        String str2 = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("openVideoEdit ; file invalid :");
        LIZ.append(str2);
        H7B.LJ(X1D.LIZIZ(LIZ));
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super MediaModel> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
