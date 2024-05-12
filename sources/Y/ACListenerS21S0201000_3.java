package Y;

import X.C176996x5;
import X.C178646zk;
import X.C188927bE;
import X.C188947bG;
import X.C2U8;
import X.C3A4;
import X.C55096Ljo;
import X.C55230Lly;
import X.C61995OUt;
import X.C76800UCe;
import X.C76T;
import X.C7AL;
import X.C7AY;
import X.C86184Xs4;
import X.C8L7;
import X.C8L9;
import X.InterfaceC176256vt;
import X.InterfaceC26318AUo;
import X.InterfaceC26321AUr;
import X.InterfaceC88472Yns;
import X.ORZ;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.speed.LandscapeCellSpeedAssem;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.experiments.LandscapeRefactorExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS1S0000001_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ACListenerS21S0201000_3 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS21S0201000_3 aCListenerS21S0201000_3, View view) {
        switch (aCListenerS21S0201000_3.i2) {
            case 0:
                C176996x5 c176996x5 = (C176996x5) aCListenerS21S0201000_3.l0;
                InterfaceC176256vt interfaceC176256vt = (InterfaceC176256vt) aCListenerS21S0201000_3.l1;
                c176996x5.LJIILJJIL();
                interfaceC176256vt.LJ();
                return;
            default:
                C86184Xs4 c86184Xs4 = (C86184Xs4) aCListenerS21S0201000_3.l0;
                View view2 = (View) aCListenerS21S0201000_3.l1;
                InterfaceC26321AUr interfaceC26321AUr = c86184Xs4.LJIIIIZZ;
                if (interfaceC26321AUr != null) {
                    ((InterfaceC26318AUo) interfaceC26321AUr).onViewImageAvatarClick(c86184Xs4.LIZJ, view2);
                    return;
                }
                return;
        }
    }

    public static final void onClick$1(ACListenerS21S0201000_3 aCListenerS21S0201000_3, View view) {
        String str;
        VideoQuickCommentAssem videoQuickCommentAssem = (VideoQuickCommentAssem) aCListenerS21S0201000_3.l0;
        String emoji = (String) ListProtector.get((List) aCListenerS21S0201000_3.l1, aCListenerS21S0201000_3.i2);
        if (Build.VERSION.SDK_INT >= 29) {
            C61995OUt c61995OUt = (C61995OUt) videoQuickCommentAssem.LLIIJI.getValue();
            if (c61995OUt != null) {
                c61995OUt.LIZ();
            }
        } else {
            C61995OUt c61995OUt2 = (C61995OUt) videoQuickCommentAssem.LLIIJI.getValue();
            if (c61995OUt2 != null) {
                c61995OUt2.LIZIZ(85, 61);
            }
        }
        CommentService.LIZ.getClass();
        CommentServiceImpl.LJJL().LJJJJJ(emoji);
        Aweme commentInputAweme = videoQuickCommentAssem.getCommentInputAweme();
        if (commentInputAweme == null || (str = commentInputAweme.getAid()) == null) {
            str = "";
        }
        C7AL c7al = videoQuickCommentAssem.r4().get(str);
        if (!c7al.LJLILLLLZI) {
            videoQuickCommentAssem.B4();
            Set LLJILLL = ORZ.LLJILLL(c7al.LJLJI);
            LLJILLL.add(emoji);
            videoQuickCommentAssem.r4().LIZ(str, C7AL.L(c7al, false, false, LLJILLL, 3));
            C7AY c7ay = videoQuickCommentAssem.LLIIL;
            if (c7ay != null) {
                c7ay.LJ(emoji);
            }
            C178646zk c178646zk = new C178646zk(1);
            c178646zk.LJLILLLLZI = str;
            o.LJIIIZ(emoji, "emoji");
            c178646zk.LJLJI = emoji;
            C2U8.LIZ(c178646zk);
        }
    }

    public static final void onClick$2(ACListenerS21S0201000_3 aCListenerS21S0201000_3, View view) {
        int i;
        float f;
        LandscapeFeedPlayerAbility landscapeFeedPlayerAbility;
        boolean z;
        C8L7 c8l7 = ((C188927bE) aCListenerS21S0201000_3.l0).LJLJJI;
        if (c8l7 != null) {
            o.LJIIIIZZ(((RecyclerView.ViewHolder) aCListenerS21S0201000_3.l1).itemView, "holder.itemView");
            int i2 = aCListenerS21S0201000_3.i2;
            ArrayList<C188947bG> arrayList = c8l7.LIZ.LLFFF;
            if (arrayList != null) {
                int size = arrayList.size();
                i = 0;
                while (i < size) {
                    if (((C188947bG) ListProtector.get(arrayList, i)).LJLILLLLZI) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
            if (i == i2) {
                return;
            }
            Aweme aweme = c8l7.LIZIZ.getAweme();
            String str = c8l7.LIZIZ.mEventType;
            List<Float> list = LandscapeCellSpeedAssem.LLIIII;
            float floatValue = ((Number) ListProtector.get(list, i2)).floatValue();
            if (i != -1) {
                f = ((Number) ListProtector.get(list, i)).floatValue();
            } else {
                f = 1.0f;
            }
            C3A4.LIZ(aweme, str, "click_landscape_screen_button", floatValue, f, c8l7.LIZJ, 0L);
            c8l7.LIZLLL.vibrate(12L);
            ArrayList<C188947bG> arrayList2 = c8l7.LIZ.LLFFF;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C188947bG c188947bG = (C188947bG) ListProtector.get(arrayList2, i3);
                    if (i3 == i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c188947bG.LJLILLLLZI = z;
                }
            }
            C188927bE c188927bE = c8l7.LIZ.LLD;
            if (c188927bE != null) {
                c188927bE.notifyDataSetChanged();
            }
            AssemViewModel assemViewModel = (AssemViewModel) c8l7.LIZ.LLFZ.getValue();
            List<Float> list2 = LandscapeCellSpeedAssem.LLIIII;
            float floatValue2 = ((Number) ListProtector.get(list2, i2)).floatValue();
            assemViewModel.getClass();
            assemViewModel.setState(new AqS1S0000001_3(floatValue2, 2));
            AssemViewModel assemViewModel2 = (AssemViewModel) c8l7.LIZ.LLI.getValue();
            float floatValue3 = ((Number) ListProtector.get(list2, i2)).floatValue();
            assemViewModel2.getClass();
            assemViewModel2.setState(new AqS1S0000001_3(floatValue3, 1));
            LandscapeRefactorExperiment.LIZ.getClass();
            if (LandscapeRefactorExperiment.LIZJ()) {
                Fragment LJIIIZ = C55096Ljo.LJIIIZ(c8l7.LIZ);
                if (LJIIIZ != null && (landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ, null), LandscapeFeedPlayerAbility.class, null)) != null) {
                    landscapeFeedPlayerAbility.Cd0(((Number) ListProtector.get(list2, i2)).floatValue());
                }
            } else {
                C2U8.LIZ(new C8L9(((Number) ListProtector.get(list2, i2)).floatValue()));
            }
            AnimatorSet animatorSet = c8l7.LIZ.LLFF;
            if (animatorSet != null) {
                animatorSet.start();
            } else {
                o.LJIJI("hideAnimSet");
                throw null;
            }
        }
    }

    public static final void onClick$3(ACListenerS21S0201000_3 aCListenerS21S0201000_3, View view) {
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = ((C76T) aCListenerS21S0201000_3.l0).LJLJLJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(ListProtector.get((List) aCListenerS21S0201000_3.l1, aCListenerS21S0201000_3.i2));
        }
    }

    public static final void onClick$4(ACListenerS21S0201000_3 aCListenerS21S0201000_3, View view) {
        switch (aCListenerS21S0201000_3.i2) {
            case 0:
                Fragment fragment = (Fragment) aCListenerS21S0201000_3.l0;
                String str = (String) aCListenerS21S0201000_3.l1;
                SmartRoute buildRoute = SmartRouter.buildRoute(fragment.mo49getActivity(), "//filtercomments/dislike");
                buildRoute.withParam("enter_from", str);
                buildRoute.open();
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS21S0201000_3.l0).lambda$initUnits$113((Context) aCListenerS21S0201000_3.l1, view);
                return;
        }
    }

    public ACListenerS21S0201000_3(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
