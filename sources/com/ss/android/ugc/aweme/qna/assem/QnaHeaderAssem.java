package com.ss.android.ugc.aweme.qna.assem;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C214298b3;
import X.C38350F3i;
import X.C47704Ins;
import X.C52900KpU;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72211SVr;
import X.C72214SVu;
import X.C72215SVv;
import X.C72219SVz;
import X.C78926UyI;
import X.C80217Ve1;
import X.C9BD;
import X.EF7;
import X.HG3;
import X.RBX;
import X.TBT;
import Y.ACListenerS32S0100000_12;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaMobViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS16S0500000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QnaHeaderAssem extends UIContentAssem {
    public ActivityC45651qj LJLIL;
    public boolean LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C214298b3 LJLJJI;
    public QnaMobViewModel LJLJJL;

    public QnaHeaderAssem() {
        new LinkedHashMap();
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C72214SVu.class, null), checkSupervisorPrepared());
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(QnaBannerViewModel.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9bd, new AqS162S0100000_12(LIZ, 857), C72211SVr.INSTANCE, null);
    }

    public final C72214SVu v3() {
        return (C72214SVu) this.LJLJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            this.LJLIL = LIZ;
            this.LJLILLLLZI = TextUtils.equals(v3().LJLJI, ((RBX) HG3.LJIILL()).getCurUserId());
            TextView textView = (TextView) view.findViewById(R.id.ihu);
            TextView textView2 = (TextView) view.findViewById(R.id.ihv);
            SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.ihs);
            View findViewById = view.findViewById(R.id.iht);
            C80217Ve1 c80217Ve1 = (C80217Ve1) view.findViewById(R.id.ihd);
            if (this.LJLILLLLZI) {
                textView2.setVisibility(0);
                findViewById.setVisibility(8);
                c80217Ve1.setExpanded(false);
            } else {
                c80217Ve1.LIZ(new C72215SVv(textView2));
            }
            ActivityC45651qj activityC45651qj = this.LJLIL;
            Long l = null;
            if (activityC45651qj != null) {
                this.LJLJJL = (QnaMobViewModel) new ViewModelProvider(activityC45651qj).get(QnaMobViewModel.class);
                ActivityC45651qj activityC45651qj2 = this.LJLIL;
                if (activityC45651qj2 != null) {
                    activityC45651qj2.getOnBackPressedDispatcher().LIZ(this, new C72219SVz(this));
                    C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.ihf), new ACListenerS32S0100000_12(this, 76));
                    if (!v3().LIZ()) {
                        QnaBannerViewModel qnaBannerViewModel = (QnaBannerViewModel) this.LJLJJI.getValue();
                        String str = v3().LJLJI;
                        if (str != null) {
                            l = C38350F3i.LJJIZ(str);
                        }
                        String lastRecordedSecUid = ((RBX) HG3.LJIILL()).getLastRecordedSecUid();
                        o.LJIIIIZZ(lastRecordedSecUid, "userService().lastRecordedSecUid");
                        qnaBannerViewModel.gv0(l, lastRecordedSecUid);
                    } else {
                        if (C52900KpU.LIZ) {
                            string = EF7.LIZIZ().getString(R.string.pnp);
                        } else {
                            string = EF7.LIZIZ().getString(R.string.pr3);
                        }
                        o.LJIIIIZZ(string, "if (QnaLayoutOptimizatio…ted_header)\n            }");
                        textView2.setText(string);
                    }
                    AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJJI.getValue(), new TBT() { // from class: X.SVs
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((E86) obj).LJLIL;
                        }
                    }, null, new AqS178S0100000_12(findViewById, 268), new AqS159S0200000_12(findViewById, this, 34), new AqS16S0500000_12(findViewById, this, textView2, textView, smartImageView, 3), 2, null);
                    TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ii_);
                    if (o.LJ(v3().LJLILLLLZI, "click_creator_qna") || o.LJ(v3().LJLILLLLZI, "click_toast") || o.LJ(v3().LJLILLLLZI, "creator_tools")) {
                        tuxIconView.setVisibility(0);
                    }
                    C16880lQ.LJJJ(tuxIconView, new ACListenerS32S0100000_12(this, 203));
                    return;
                }
                o.LJIJI("activity");
                throw null;
            }
            o.LJIJI("activity");
            throw null;
        }
    }
}
