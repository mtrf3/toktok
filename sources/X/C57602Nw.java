package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.plugin.progressbar.NewUserProgressModel$ProgressBarInfo;
import com.ss.android.ugc.aweme.plugin.progressbar.NewUserProgressModel$Stage;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.2Nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57602Nw extends RelativeLayout {
    public RelativeLayout LJLIL;
    public LinearLayout LJLILLLLZI;
    public TextView LJLJI;
    public ProgressBar LJLJJI;
    public NewUserProgressModel$ProgressBarInfo LJLJJL;
    public Fragment LJLJJLL;
    public BaseListFragmentPanel LJLJL;
    public BaseListFragmentPanel LJLJLJ;
    public String LJLJLLL;
    public int LJLL;
    public boolean LJLLI;

    public final RelativeLayout getProgressViewRoot() {
        RelativeLayout relativeLayout = this.LJLIL;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        o.LJIJI("progressViewRoot");
        throw null;
    }

    public final void LIZ() {
        String str;
        String str2;
        Integer num;
        String str3;
        int i;
        String str4;
        List<NewUserProgressModel$Stage> list;
        LIZIZ();
        NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo = this.LJLJJL;
        if (newUserProgressModel$ProgressBarInfo == null || (str = newUserProgressModel$ProgressBarInfo.textProgressComplete) == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        C188727au c188727au = new C188727au();
        String str5 = C2OE.LIZ;
        if (str5 != null) {
            c188727au.LJIIIZ("enter_from", str5);
            Keva keva = C2OE.LIZLLL;
            c188727au.LIZLLL(keva.getInt("video_watched_cnt", -1), "video_watched_cnt");
            c188727au.LIZJ("play_time_duration", keva.getDouble("play_time_duration", -1.0d));
            EnumC61772bd enumC61772bd = C2OE.LJIILJJIL;
            EnumC61772bd enumC61772bd2 = EnumC61772bd.PERCENTAGE;
            if (enumC61772bd == enumC61772bd2) {
                str2 = "video_count";
            } else {
                str2 = "duration";
            }
            c188727au.LJIIIZ("bar_type", str2);
            FMX.LJIIL("complete_nuf_progress_bar", c188727au.LIZ);
            if (C2OE.LJIILJJIL == enumC61772bd2) {
                C2OE.LJIIJJI += 5;
                C2OE.LJ.put(C2OE.LJIIJ, Integer.valueOf(C2OE.LJIIJJI));
            } else {
                C2OE.LJIIL += 15;
                C2OE.LJ.put(C2OE.LJIIJ, Integer.valueOf(C2OE.LJIIL));
            }
            keva.storeString("progress_map_key", new JSONObject(C2OE.LJ).toString());
            NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo2 = this.LJLJJL;
            if (newUserProgressModel$ProgressBarInfo2 == null || (num = newUserProgressModel$ProgressBarInfo2.style) == null) {
                return;
            }
            int intValue = num.intValue();
            EnumC61772bd.Companion.getClass();
            if (C61892bp.LIZ(intValue) == EnumC61772bd.DURATION) {
                NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo3 = this.LJLJJL;
                if (newUserProgressModel$ProgressBarInfo3 != null && (list = newUserProgressModel$ProgressBarInfo3.stages) != null) {
                    i = ((Number) ListProtector.get(((NewUserProgressModel$Stage) ListProtector.get(list, 0)).range, 0)).intValue();
                } else {
                    i = 0;
                }
                NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo4 = this.LJLJJL;
                if (newUserProgressModel$ProgressBarInfo4 != null && (str4 = newUserProgressModel$ProgressBarInfo4.textProgressComplete) != null) {
                    str3 = Q8U.LIZIZ(new Object[]{Integer.valueOf((i * 1000) / 60000)}, 1, str4, "format(this, *args)");
                }
                str3 = null;
            } else {
                NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo5 = this.LJLJJL;
                if (newUserProgressModel$ProgressBarInfo5 != null) {
                    str3 = newUserProgressModel$ProgressBarInfo5.textProgressComplete;
                }
                str3 = null;
            }
            Fragment fragment = this.LJLJJLL;
            if (fragment != null) {
                ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
                if (mo49getActivity == null) {
                    return;
                }
                C26045AKb c26045AKb = new C26045AKb(mo49getActivity);
                c26045AKb.LJFF(R.raw.icon_color_gradient_heart);
                c26045AKb.LJIIIZ(str3);
                c26045AKb.LIZLLL(2000L);
                c26045AKb.LJIIJ();
                return;
            }
            o.LJIJI("fragment");
            throw null;
        }
        o.LJIJI("enterFrom");
        throw null;
    }

    public final void LIZIZ() {
        getProgressViewRoot().setVisibility(8);
        getProgressViewRoot().requestLayout();
    }

    public final void LIZJ(boolean z) {
        int i;
        RelativeLayout progressViewRoot = getProgressViewRoot();
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        progressViewRoot.setVisibility(i);
        if (z) {
            getProgressViewRoot().setVisibility(8);
            C16880lQ.LJIJ(getProgressViewRoot(), new View.OnClickListener() { // from class: X.2Nz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        } else {
            C16880lQ.LJIJ(getProgressViewRoot(), new ACListenerS21S0100000_1(this, 36));
        }
        requestLayout();
    }

    public final void setProgressViewRoot(RelativeLayout relativeLayout) {
        o.LJIIIZ(relativeLayout, "<set-?>");
        this.LJLIL = relativeLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57602Nw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJLLL = "";
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.acq, this, true);
        View findViewById = findViewById(R.id.j7r);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.root_new_user_progress_bar)");
        setProgressViewRoot((RelativeLayout) findViewById);
        View findViewById2 = findViewById(R.id.b3s);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.cancel_button)");
        this.LJLILLLLZI = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.ia9);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.progress)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.kp2);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.sub_progress)");
        this.LJLJJI = (ProgressBar) findViewById4;
    }

    public final void LJ(int i, int i2) {
        Integer num;
        List<NewUserProgressModel$Stage> list;
        int intValue;
        String str;
        NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo = this.LJLJJL;
        if (newUserProgressModel$ProgressBarInfo != null) {
            num = newUserProgressModel$ProgressBarInfo.style;
            list = newUserProgressModel$ProgressBarInfo.stages;
        } else {
            num = null;
            list = null;
        }
        if (i < 100) {
            if (num != null && list != null) {
                TextView textView = this.LJLJI;
                if (textView != null) {
                    textView.setText(((NewUserProgressModel$Stage) ListProtector.get(list, 0)).progressBarCopy);
                    C61892bp c61892bp = EnumC61772bd.Companion;
                    int intValue2 = num.intValue();
                    c61892bp.getClass();
                    EnumC61772bd LIZ = C61892bp.LIZ(intValue2);
                    EnumC61772bd enumC61772bd = EnumC61772bd.PERCENTAGE;
                    if (LIZ == enumC61772bd) {
                        Keva keva = C2OE.LIZLLL;
                        boolean z = keva.getBoolean("first_init", false);
                        if (z) {
                            keva.storeBoolean("first_init", false);
                        }
                        if (keva.contains("progress_milestone_key")) {
                            C2OF.LJIIIZ(new JSONObject(keva.getString("progress_milestone_key", "")), C2OE.LJII);
                        }
                        HashMap<String, Object> hashMap = C2OE.LJII;
                        if (hashMap.get(C2OE.LJIIJ) == null) {
                            intValue = -1;
                        } else {
                            Object obj = hashMap.get(C2OE.LJIIJ);
                            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
                            intValue = ((Integer) obj).intValue();
                        }
                        if (z || (!z && ((i == 25 || i == 50 || i == 75) && i > intValue))) {
                            keva.storeInt("milestone_progress_reported", i);
                            hashMap.put(C2OE.LJIIJ, Integer.valueOf(i));
                            keva.storeString("progress_milestone_key", new JSONObject(hashMap).toString());
                            C188727au c188727au = new C188727au();
                            String str2 = C2OE.LIZ;
                            if (str2 != null) {
                                c188727au.LJIIIZ("enter_from", str2);
                                c188727au.LIZLLL(i, "progress_pct");
                                c188727au.LIZLLL(z ? 1 : 0, "is_init_first_show");
                                c188727au.LIZLLL(keva.getInt("video_watched_cnt", -1), "video_watched_cnt");
                                c188727au.LIZJ("play_time_duration", keva.getDouble("play_time_duration", -1.0d));
                                if (C2OE.LJIILJJIL == enumC61772bd) {
                                    str = "video_count";
                                } else {
                                    str = "duration";
                                }
                                c188727au.LJIIIZ("bar_type", str);
                                c188727au.LIZLLL(C2OE.LJIILIIL + 1, "video_position");
                                FMX.LJIIL("show_nuf_progress_bar", c188727au.LIZ);
                            } else {
                                o.LJIJI("enterFrom");
                                throw null;
                            }
                        }
                        Iterator<NewUserProgressModel$Stage> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            NewUserProgressModel$Stage next = it.next();
                            if (((Number) ListProtector.get(next.range, 0)).intValue() <= i && i <= ((Number) ListProtector.get(next.range, 1)).intValue()) {
                                String str3 = next.progressBarCopy;
                                if (str3 != null) {
                                    LIZLLL(str3, i, -1, EnumC61772bd.PERCENTAGE);
                                }
                            }
                        }
                    } else if (C61892bp.LIZ(num.intValue()) == EnumC61772bd.DURATION) {
                        Iterator<NewUserProgressModel$Stage> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            NewUserProgressModel$Stage next2 = it2.next();
                            if (((Number) ListProtector.get(next2.range, 0)).intValue() > i2 && i2 >= ((Number) ListProtector.get(next2.range, 1)).intValue()) {
                                String str4 = next2.progressBarCopy;
                                if (str4 != null) {
                                    LIZLLL(str4, -1, i2, EnumC61772bd.DURATION);
                                }
                            }
                        }
                    } else {
                        LIZIZ();
                    }
                    ProgressBar progressBar = this.LJLJJI;
                    if (progressBar != null) {
                        progressBar.setProgress(i);
                        return;
                    } else {
                        o.LJIJI("subProgress");
                        throw null;
                    }
                }
                o.LJIJI("progressStatus");
                throw null;
            }
        } else if (i == 100) {
            LIZ();
            return;
        }
        LIZIZ();
    }

    public final void LIZLLL(String str, int i, int i2, EnumC61772bd enumC61772bd) {
        TextView textView = this.LJLJI;
        if (textView != null) {
            if (s.LJJJLZIJ(str, "%s", false)) {
                if (enumC61772bd == EnumC61772bd.PERCENTAGE) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(i);
                    LIZ.append('%');
                    str = ujb.o.LJJJJZI(str, "%s", X1D.LIZIZ(LIZ), true);
                } else {
                    str = ujb.o.LJJJJZI(str, "%s", String.valueOf(((i2 * 1000) / 60000) + 1), true);
                }
            }
            textView.setText(str);
            return;
        }
        o.LJIJI("progressStatus");
        throw null;
    }
}
