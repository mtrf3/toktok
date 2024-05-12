package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.ss.android.ugc.aweme.share.ShareFlavorService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.IAm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46180IAm<T> implements InterfaceC64592gB {
    public final /* synthetic */ BaseSharePackage LJLIL;
    public final /* synthetic */ C46181IAn LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C5H3<DialogC25756A8y> LJLJJL;

    public C46180IAm(BaseSharePackage baseSharePackage, C46181IAn c46181IAn, Context context, String str, C62822Ol8 c62822Ol8) {
        this.LJLIL = baseSharePackage;
        this.LJLILLLLZI = c46181IAn;
        this.LJLJI = context;
        this.LJLJJI = str;
        this.LJLJJL = c62822Ol8;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String content = (String) obj;
        ShareFlavorService.LIZ.getClass();
        ShareFlavorService LIZ = C2062987t.LIZ();
        o.LJIIIIZZ(content, "it");
        BaseSharePackage baseSharePackage = this.LJLIL;
        o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        LIZ.LJ((SharePackage) baseSharePackage, content);
        C46181IAn c46181IAn = this.LJLILLLLZI;
        Context context = this.LJLJI;
        c46181IAn.getClass();
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Object LLILL = C16880lQ.LLILL(context, "clipboard");
        o.LJII(LLILL, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) LLILL;
        ClipData clipData = ClipData.newPlainText(content, content);
        try {
            OHS ohs = C252609vk.LIZ;
            o.LJIIIIZZ(clipData, "clipData");
            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476399114, "bpea-228");
            ohs.getClass();
            OHS.LIZIZ(clipboardManager, clipData, LJJIIJ);
            if (c46181IAn.LJLIL) {
                C05L.LIZLLL(context, R.string.dwb);
            }
        } catch (Q0C e) {
            C36922EeM.LIZ(e);
        }
        V1B.LJLILLLLZI(this.LJLJJL.getValue());
        C109254Qn.LIZ(this.LJLJJI, "copy");
    }
}
