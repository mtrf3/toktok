package X;

import Y.ACListenerS21S0100000_1;
import Y.IDCListenerS294S0100000_1;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactioncontainer.IMReactionViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.4a5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111774a5 implements InterfaceC1039746f {
    public final Context LJLIL;
    public final ViewGroup LJLILLLLZI;
    public final AnonymousClass470 LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final InterfaceC111904aI LJLJJLL;
    public final Context LJLJL;
    public final ViewGroup LJLJLJ;
    public final TuxTextView LJLJLLL;
    public final TuxIconView LJLL;
    public final TuxIconView LJLLI;
    public final C111754a3 LJLLILLLL;
    public final IMReactionViewModel LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public long LJLLLLLL;
    public long LJLZ;
    public boolean LJZ;
    public final RecyclerView LJZI;
    public final ACListenerS21S0100000_1 LJZL;
    public final ACListenerS21S0100000_1 LL;
    public final IDCListenerS294S0100000_1 LLD;

    @Override // X.InterfaceC1039746f
    public final void LIZJ() {
        this.LJLLL = true;
    }

    @Override // X.InterfaceC1039746f
    public final void LLZ() {
        ((ArrayList) this.LJLLJ.LJLIL).clear();
    }

    @Override // X.InterfaceC1039746f
    public final void LIZLLL(boolean z) {
        this.LJZ = z;
    }

    @Override // X.InterfaceC1039746f
    public final void LIZ(String str, boolean z) {
        if (o.LJ(this.LJLLJ.LJLJI, "❤️")) {
            return;
        }
        if (z) {
            this.LJLJLJ.performHapticFeedback(0);
        }
        this.LJLLJ.hv0(str);
        this.LJLJJLL.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c0  */
    @Override // X.InterfaceC1039746f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C109544Rq r10, boolean r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111774a5.LIZIZ(X.4Rq, boolean, java.lang.String):void");
    }

    public C111774a5(Context context, ViewGroup viewGroup, AnonymousClass470 anonymousClass470, boolean z, boolean z2, C47B c47b) {
        this.LJLIL = context;
        this.LJLILLLLZI = viewGroup;
        this.LJLJI = anonymousClass470;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = c47b;
        Context context2 = viewGroup.getContext();
        this.LJLJL = context2;
        this.LJLJLJ = (ViewGroup) viewGroup.findViewById(R.id.g2x);
        this.LJLJLLL = (TuxTextView) viewGroup.findViewById(R.id.cu_);
        this.LJLL = (TuxIconView) viewGroup.findViewById(R.id.ebd);
        this.LJLLI = (TuxIconView) viewGroup.findViewById(R.id.e9e);
        o.LJIIIIZZ(context2, "context");
        C111754a3 c111754a3 = new C111754a3(context2);
        this.LJLLILLLL = c111754a3;
        this.LJLLJ = new IMReactionViewModel();
        this.LJZ = true;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.ip1);
        recyclerView.setAdapter(c111754a3);
        recyclerView.setItemAnimator(null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.LJZI = recyclerView;
        this.LJZL = new ACListenerS21S0100000_1(this, 189);
        this.LL = new ACListenerS21S0100000_1(this, 190);
        this.LLD = new IDCListenerS294S0100000_1(this, 2);
    }
}
