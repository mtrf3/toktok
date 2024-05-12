package Y;

import X.C16880lQ;
import X.C188727au;
import X.C2MA;
import X.C70922qO;
import X.C78688UuS;
import X.C89S;
import X.FMX;
import X.T5T;
import X.X1D;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.casting.ui.casting.CastingPanelComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.system.SystemComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public class ARunnableS2S1100000_1 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C70922qO.LIZ("CastingPanelComponent", "onChangeFeed");
        if (!((CastingPanelComponent) this.l1).E3()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onChangeFeed aid: ");
        LIZ.append(this.s0);
        C70922qO.LIZ("CastingPanelComponent", X1D.LIZIZ(LIZ));
        List<Aweme> list = ((CastingPanelComponent) this.l1).LJLJI;
        String str = this.s0;
        Iterator it = ((ArrayList) list).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(((Aweme) it.next()).getAid(), str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() != -1) {
            CastingPanelComponent castingPanelComponent = (CastingPanelComponent) this.l1;
            int intValue = valueOf.intValue();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onChangeFeed index: ");
            LIZ2.append(intValue);
            C70922qO.LIZ("CastingPanelComponent", X1D.LIZIZ(LIZ2));
            if (castingPanelComponent.LJLJJL >= 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onChangeFeed manualSelectedIndex: ");
                LIZ3.append(castingPanelComponent.LJLJJL);
                C70922qO.LIZ("CastingPanelComponent", X1D.LIZIZ(LIZ3));
                if (castingPanelComponent.LJLJJL == intValue) {
                    castingPanelComponent.LJLJJL = -1;
                    return;
                }
                return;
            }
            IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) castingPanelComponent.LJLJL.getValue();
            if (iViewPagerAbility != null) {
                iViewPagerAbility.setCurrentItem(intValue, false);
            }
        }
        List<Aweme> list2 = ((CastingPanelComponent) this.l1).LJLJI;
        String str2 = this.s0;
        Iterator it2 = ((ArrayList) list2).iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (o.LJ(((Aweme) it2.next()).getAid(), str2)) {
                if (i2 >= 0 && i2 < ((ArrayList) ((CastingPanelComponent) this.l1).LJLJI).size()) {
                    Aweme aweme = (Aweme) ListProtector.get(((CastingPanelComponent) this.l1).LJLJI, i2);
                    if (C78688UuS.LJJJJJ(aweme)) {
                        CastingPanelComponent castingPanelComponent2 = (CastingPanelComponent) this.l1;
                        if (!castingPanelComponent2.LJLL) {
                            try {
                                IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) castingPanelComponent2.LJLJLJ.getValue();
                                if (iPlayerComponentAbility != null) {
                                    iPlayerComponentAbility.pausePlayer();
                                }
                                ((CastingPanelComponent) this.l1).LJLL = true;
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    }
                    IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) ((CastingPanelComponent) this.l1).LJLJLJ.getValue();
                    if (iPlayerComponentAbility2 != null) {
                        iPlayerComponentAbility2.tryResumePlay(aweme);
                    }
                    ((CastingPanelComponent) this.l1).LJLL = false;
                    return;
                }
                return;
            }
            i2++;
        }
    }

    public final void LIZ$1() {
        WeakHandler weakHandler = ((BaseListFragmentPanel) this.l1).mHandler;
        if (weakHandler != null) {
            weakHandler.removeMessages(10);
        }
        C2MA curFeedViewHolder = ((BaseListFragmentPanel) this.l1).getCurFeedViewHolder();
        if (curFeedViewHolder != null && curFeedViewHolder.getAweme() != null && TextUtils.equals(curFeedViewHolder.getAweme().getAid(), this.s0) && curFeedViewHolder.getAweme().isLive() && ((BaseListFragmentPanel) this.l1).isViewValid()) {
            Aweme aweme = curFeedViewHolder.getAweme();
            ((BaseListFragmentPanel) this.l1).getContext();
            C78688UuS.LJJJJLL(1, aweme.getAuthor().getUid(), aweme.getAuthor().roomId, C78688UuS.LJJIJIL("homepage_follow", "live", ((BaseListFragmentPanel) this.l1).getMobBaseJsonObject().optString("request_id")));
        }
    }

    public final void LIZ$2() {
        String str = this.s0;
        if (str == null || str.length() == 0 || ((C89S) this.l1).getMeasuredWidth() == 0 || ((C89S) this.l1).getMeasuredHeight() == 0) {
            return;
        }
        CharSequence text = ((C89S) this.l1).getText();
        o.LJIIIIZZ(text, "text");
        int LJJLIIIJL = s.LJJLIIIJL(text, this.s0, 0, false, 6);
        if (LJJLIIIJL == -1) {
            return;
        }
        int length = (this.s0.length() + LJJLIIIJL) - 1;
        TextPaint paint = ((C89S) this.l1).getPaint();
        CharSequence text2 = ((C89S) this.l1).getText();
        o.LJIIIIZZ(text2, "text");
        int measureText = (int) paint.measureText(text2.subSequence(0, LJJLIIIJL + 2).toString());
        TextPaint paint2 = ((C89S) this.l1).getPaint();
        CharSequence text3 = ((C89S) this.l1).getText();
        o.LJIIIIZZ(text3, "text");
        if (measureText / ((C89S) this.l1).getMeasuredWidth() == ((int) paint2.measureText(text3.subSequence(0, length + 1).toString())) / ((C89S) this.l1).getMeasuredWidth()) {
            return;
        }
        C89S c89s = (C89S) this.l1;
        StringBuffer stringBuffer = new StringBuffer(c89s.getText().toString());
        stringBuffer.insert(LJJLIIIJL, "\n");
        c89s.setText(stringBuffer.toString());
    }

    public static final void run$0(ARunnableS2S1100000_1 aRunnableS2S1100000_1) {
        boolean LIZ;
        try {
            FMX.LJIIL(aRunnableS2S1100000_1.s0, (HashMap) aRunnableS2S1100000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S1100000_1 aRunnableS2S1100000_1) {
        boolean LIZ;
        try {
            T5T t5t = (T5T) ((QnaAskQuestionFragment) aRunnableS2S1100000_1.l1)._$_findCachedViewById(R.id.a8v);
            if (t5t != null) {
                t5t.setSelection(aRunnableS2S1100000_1.s0.length(), aRunnableS2S1100000_1.s0.length());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S1100000_1 aRunnableS2S1100000_1) {
        boolean LIZ;
        try {
            aRunnableS2S1100000_1.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS2S1100000_1 aRunnableS2S1100000_1) {
        boolean LIZ;
        try {
            aRunnableS2S1100000_1.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS2S1100000_1 aRunnableS2S1100000_1) {
        boolean LIZ;
        try {
            if (((SystemComponent) aRunnableS2S1100000_1.l1).isKeyguardLocked()) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", aRunnableS2S1100000_1.s0);
                c188727au.LIZLLL(1, "is_videoplayer");
                FMX.LJIIL("lock_screen", c188727au.LIZ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS2S1100000_1 aRunnableS2S1100000_1) {
        boolean LIZ;
        try {
            aRunnableS2S1100000_1.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS2S1100000_1 aRunnableS2S1100000_1) {
        boolean LIZ;
        try {
            C16880lQ.LLZILL(Toast.makeText((Context) aRunnableS2S1100000_1.l1, aRunnableS2S1100000_1.s0, 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS2S1100000_1 aRunnableS2S1100000_1) {
        boolean LIZ;
        try {
            FMX.LJIIL(aRunnableS2S1100000_1.s0, (Map) aRunnableS2S1100000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S1100000_1(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
