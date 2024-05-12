package com.ss.android.ugc.aweme.profile.widgets.mutuallabel;

import X.C110614Vt;
import X.C212428Vi;
import X.C221108m2;
import X.C246029l8;
import X.C26175APb;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C58049MqL;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C8VC;
import X.C99W;
import X.InterfaceC235089Km;
import X.TBT;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserProfileRelationLabelAssem extends UIContentAssem implements IUserProfileRelationLabelAbility {
    public final C55749LuL LJLIL;
    public final C73318Sq2 LJLILLLLZI;
    public TuxIconView LJLJI;
    public C58049MqL LJLJJI;
    public LinearLayout LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public final List<Object> LJLJLJ;
    public int LJLJLLL;
    public User LJLL;
    public final C62822Ol8 LJLLI;

    public UserProfileRelationLabelAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C26175APb.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = new C73318Sq2();
        this.LJLJLJ = new ArrayList();
        this.LJLLI = C221108m2.LIZIZ(C246029l8.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.mutuallabel.IUserProfileRelationLabelAbility
    public final void TN() {
        LinearLayout linearLayout = this.LJLJJL;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IUserProfileRelationLabelAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ((ArrayList) this.LJLJLJ).clear();
        this.LJLJLLL = 0;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IUserProfileRelationLabelAbility.class, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    @Override // com.ss.android.ugc.aweme.profile.widgets.mutuallabel.IUserProfileRelationLabelAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Pn0(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r13) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.mutuallabel.UserProfileRelationLabelAssem.Pn0(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C58049MqL c58049MqL;
        Drawable drawable;
        o.LJIIIZ(view, "view");
        this.LJLJI = (TuxIconView) view.findViewById(R.id.iuk);
        this.LJLJJI = (C58049MqL) view.findViewById(R.id.iul);
        this.LJLJJL = (LinearLayout) view.findViewById(R.id.iuj);
        if (C99W.LIZ && (c58049MqL = this.LJLJJI) != null) {
            Context context = getContext();
            if (context != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(4);
                drawable = c110614Vt.LIZ(context);
            } else {
                drawable = null;
            }
            c58049MqL.setBackground(drawable);
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9TT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LIZ;
            }
        }, new AqS170S0100000_4(this, 861));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.98a
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJJI;
            }
        }, new AqS170S0100000_4(this, 862));
    }
}
