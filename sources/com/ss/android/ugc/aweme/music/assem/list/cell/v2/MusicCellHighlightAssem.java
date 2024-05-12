package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C16880lQ;
import X.C214348b8;
import X.C240369c0;
import X.C240619cP;
import X.C240639cR;
import X.C240719cZ;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78688UuS;
import X.C78939UyV;
import X.C78983UzD;
import X.C8VC;
import X.C8XO;
import X.C9BE;
import X.InterfaceC115514g7;
import X.InterfaceC241869eQ;
import X.InterfaceC74236TBo;
import X.TBT;
import X.W5F;
import X.W5U;
import Y.ACListenerS24S0100000_4;
import Y.IDLListenerS192S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicCellHighlightAssem extends ReusedUISlotAssem<MusicCellHighlightAssem> implements C8XO<C240719cZ> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public SmartAvatarImageView LLFF;
    public TuxTextView LLFFF;
    public TuxTextView LLFII;
    public LinearLayout LLFZ;
    public final C55749LuL LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;

    static {
        TBT tbt = new TBT(MusicCellHighlightAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6j;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public MusicCellHighlightAssem() {
        new LinkedHashMap();
        this.LLI = new C55749LuL(C47704Ins.LIZJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 444);
        C65776Prg LIZ = C65352Pkq.LIZ(OriginMusicListViewModel.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 445), aqS154S0100000_4, C240619cP.INSTANCE, null, null);
    }

    public final OriginMusicArg m4() {
        return (OriginMusicArg) this.LLI.getValue();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C240719cZ c240719cZ) {
        String str;
        C240719cZ item = c240719cZ;
        o.LJIIIZ(item, "item");
        C240639cR c240639cR = item.LJLILLLLZI;
        boolean z = c240639cR.LJLILLLLZI;
        boolean z2 = c240639cR.LJLJI;
        if (z && !z2) {
            TuxTextView tuxTextView = this.LLFFF;
            if (tuxTextView != null) {
                Context context = getContext();
                String str2 = "";
                if (context != null) {
                    Object[] objArr = new Object[1];
                    User user = m4().getUser();
                    if (user == null || (str = user.getNickname()) == null) {
                        str = "";
                    }
                    objArr[0] = str;
                    String string = context.getString(R.string.i27, objArr);
                    if (string != null) {
                        str2 = string;
                    }
                }
                tuxTextView.setText(str2);
            }
            W5F LJII = W5U.LJII(C78939UyV.LJ(C78688UuS.LJJ(m4().getUser())));
            LJII.LJIIJJI = R.drawable.b7n;
            LJII.LJJIJIIJIL = true;
            LJII.LJJIIJ = this.LLFF;
            C16880lQ.LLJJJ(LJII);
            C78983UzD.LJJLIIIJL(Y3());
            Y3().getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS192S0100000_4(this, 5));
            return;
        }
        C78983UzD.LJJIL(Y3());
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFF = (SmartAvatarImageView) view.findViewById(R.id.gr0);
        this.LLFFF = (TuxTextView) view.findViewById(R.id.gr1);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.gr3);
        if (tuxTextView != null) {
            C240369c0 c240369c0 = (C240369c0) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC241869eQ.class));
            if (c240369c0 != null && !c240369c0.LIZLLL) {
                C78983UzD.LJJIL(tuxTextView);
            } else {
                C78983UzD.LJJLIIIJL(tuxTextView);
                C16880lQ.LJJJJI(tuxTextView, new ACListenerS24S0100000_4(this, 82));
            }
        } else {
            tuxTextView = null;
        }
        this.LLFII = tuxTextView;
        this.LLFZ = (LinearLayout) view.findViewById(R.id.gr2);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
