package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GwN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43135GwN<T> implements InterfaceC64592gB {
    public final /* synthetic */ C43138GwQ LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ AbstractC43136GwO<Object> LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    public C43135GwN(C43138GwQ c43138GwQ, String str, C43139GwR c43139GwR, boolean z) {
        this.LJLIL = c43138GwQ;
        this.LJLILLLLZI = str;
        this.LJLJI = c43139GwR;
        this.LJLJJI = z;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        List<String> list;
        boolean z;
        C5VH photoPrepareInfo = (C5VH) obj;
        this.LJLIL.LIZ();
        if (C42113Gft.LIZ()) {
            C43133GwL.LIZLLL(this.LJLILLLLZI, photoPrepareInfo.LIZ);
        }
        C43139GwR c43139GwR = (C43139GwR) this.LJLJI;
        if (c43139GwR.LIZLLL.creativeModel.changeAvatarModel.isFromChangeAvatar) {
            photoPrepareInfo.LIZ(this.LJLILLLLZI);
            list = C47261Igj.LJJIJ(this.LJLILLLLZI);
        } else {
            list = c43139GwR.LIZJ;
        }
        if (((C43139GwR) this.LJLJI).LIZLLL.creativeModel.changeAvatarModel.isFromChangeAvatar) {
            o.LJIIIIZZ(photoPrepareInfo, "photoPrepareInfo");
            CanvasVideoData LJJJI = C79234V7u.LJJJI(photoPrepareInfo, list);
            C43139GwR c43139GwR2 = (C43139GwR) this.LJLJI;
            H9T.LJIIIIZZ(c43139GwR2, LJJJI, c43139GwR2.LJIIIIZZ, null);
            return;
        }
        o.LJIIIIZZ(photoPrepareInfo, "photoPrepareInfo");
        if (!this.LJLJJI && C1535060s.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        CanvasVideoData LJJJIL = C79234V7u.LJJJIL(photoPrepareInfo, list, z);
        C43139GwR c43139GwR3 = (C43139GwR) this.LJLJI;
        H9T.LJIIIIZZ(c43139GwR3, LJJJIL, c43139GwR3.LJIIIIZZ, null);
    }
}
