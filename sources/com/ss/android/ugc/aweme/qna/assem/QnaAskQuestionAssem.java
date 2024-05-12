package com.ss.android.ugc.aweme.qna.assem;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C188727au;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72214SVu;
import X.C72744Sgm;
import X.C78926UyI;
import X.C7W1;
import X.C8YN;
import X.C9BD;
import X.FMX;
import X.HG3;
import X.RBX;
import X.TBT;
import X.W5F;
import X.W5U;
import Y.ACListenerS29S0100000_9;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaMobViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QnaAskQuestionAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public ActivityC45651qj LJLILLLLZI;
    public boolean LJLJI;
    public C7W1 LJLJJI;
    public final C214298b3 LJLJJL;
    public QnaMobViewModel LJLJJLL;
    public ArrayList<User> LJLJL;

    public QnaAskQuestionAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C72214SVu.class, null), checkSupervisorPrepared());
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(QnaBannerViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9bd, new AqS162S0100000_12(LIZ, 856), C72744Sgm.INSTANCE, null);
        this.LJLJL = new ArrayList<>();
    }

    public final C72214SVu v3() {
        return (C72214SVu) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View view2;
        SmartImageView smartImageView;
        boolean z;
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            this.LJLILLLLZI = LIZ;
            this.LJLJI = TextUtils.equals(v3().LJLJI, ((RBX) HG3.LJIILL()).getCurUserId());
            if (v3().LIZ()) {
                view.setVisibility(0);
            }
            ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
            if (activityC45651qj != null) {
                LayoutInflater layoutInflater = activityC45651qj.getLayoutInflater();
                o.LJIIIIZZ(layoutInflater, "activity.layoutInflater");
                C7W1 c7w1 = new C7W1(activityC45651qj, layoutInflater, R.string.re);
                this.LJLJJI = c7w1;
                c7w1.LIZIZ((RelativeLayout) view);
                String str = v3().LJLIL;
                String str2 = v3().LJLILLLLZI;
                C188727au c188727au = new C188727au();
                if (str != null) {
                    c188727au.LJI("enter_from", str);
                }
                if (str2 != null) {
                    c188727au.LJI("enter_method", str2);
                }
                FMX.LJIIL("show_ask_question_bubble", c188727au.LIZ);
                C7W1 c7w12 = this.LJLJJI;
                if (c7w12 != null) {
                    String avatarUrl = ((RBX) HG3.LJIILL()).getAvatarUrl();
                    o.LJIIIIZZ(avatarUrl, "userService().avatarUrl");
                    View view3 = c7w12.LIZLLL;
                    if (view3 != null) {
                        view2 = view3.findViewById(R.id.kdk);
                    } else {
                        view2 = null;
                    }
                    View view4 = c7w12.LIZLLL;
                    if (view4 != null) {
                        smartImageView = (SmartImageView) view4.findViewById(R.id.kdc);
                    } else {
                        smartImageView = null;
                    }
                    if (avatarUrl.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        if (smartImageView != null) {
                            smartImageView.setVisibility(8);
                        }
                    } else if (c7w12.LIZLLL != null) {
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        if (smartImageView != null) {
                            smartImageView.setVisibility(0);
                        }
                        W5F LJIIIIZZ = W5U.LJIIIIZZ(avatarUrl);
                        LJIIIIZZ.LJJIIJ = smartImageView;
                        C16880lQ.LLJJJ(LJIIIIZZ);
                    }
                }
                if (this.LJLJJI != null) {
                    View findViewById = view.findViewById(R.id.kdb);
                    o.LJIIIIZZ(findViewById, "view.findViewById(R.id.start_record)");
                    C16880lQ.LJIIJ(new ACListenerS29S0100000_9(new AqS178S0100000_12(this, 723), 196), findViewById);
                }
                C8YN.LJII(this, (AssemViewModel) this.LJLJJL.getValue(), new TBT() { // from class: X.Sgn
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((E86) obj).LJLJL;
                    }
                }, null, new AqS194S0100000_12(this, 289), 6);
                C8YN.LJII(this, (AssemViewModel) this.LJLJJL.getValue(), new TBT() { // from class: X.Sgo
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((E86) obj).LJLJJI;
                    }
                }, null, new AqS185S0100000_3(view, 227), 6);
                C8YN.LJII(this, (AssemViewModel) this.LJLJJL.getValue(), new TBT() { // from class: X.E87
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((E86) obj).LJLJJL);
                    }
                }, C213688a4.LIZLLL(), new AqS174S0200000_12(this, view, 29), 4);
                ActivityC45651qj activityC45651qj2 = this.LJLILLLLZI;
                if (activityC45651qj2 != null) {
                    this.LJLJJLL = (QnaMobViewModel) ViewModelProviders.of(activityC45651qj2).get(QnaMobViewModel.class);
                    return;
                } else {
                    o.LJIJI("activity");
                    throw null;
                }
            }
            o.LJIJI("activity");
            throw null;
        }
    }
}
