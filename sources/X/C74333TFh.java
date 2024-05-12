package X;

import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.TFh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74333TFh<TTaskResult, TContinuationResult> implements C10I<InterfaceC74334TFi, C76800UCe> {
    public final /* synthetic */ ViewOnClickListenerC74332TFg LIZ;
    public final /* synthetic */ Effect LIZIZ;

    public C74333TFh(ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg, Effect effect, InterfaceC72857Sib interfaceC72857Sib) {
        this.LIZ = viewOnClickListenerC74332TFg;
        this.LIZIZ = effect;
    }

    @Override // X.C10I
    public final C76800UCe then(C10K<InterfaceC74334TFi> task) {
        InterfaceC74334TFi interfaceC74334TFi;
        C8HN c8hn;
        TextView textView;
        String uniqueId;
        String str;
        LinearLayout linearLayout;
        C8HN c8hn2;
        o.LJIIIZ(task, "task");
        if (task.LJIIL() || task.LJIILJJIL()) {
            interfaceC74334TFi = this.LIZ.LJLJJLL.get(this.LIZIZ.getDesignerId());
        } else {
            interfaceC74334TFi = task.LJIIJJI();
        }
        if (interfaceC74334TFi == null) {
            LinearLayout linearLayout2 = this.LIZ.LJLIL;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } else {
            ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg = this.LIZ;
            LinearLayout linearLayout3 = viewOnClickListenerC74332TFg.LL;
            if (linearLayout3 != null) {
                C16880lQ.LJIIZILJ(linearLayout3, ViewOnClickListenerC74339TFn.LJLIL);
            }
            C170736mz c170736mz = viewOnClickListenerC74332TFg.LLFF;
            if (c170736mz != null) {
                C16880lQ.LJJJZ(c170736mz, new ACListenerS32S0100000_12(viewOnClickListenerC74332TFg, 114));
            }
            LinearLayout linearLayout4 = viewOnClickListenerC74332TFg.LLFFF;
            if (linearLayout4 != null) {
                C16880lQ.LJIIZILJ(linearLayout4, new ACListenerS32S0100000_12(viewOnClickListenerC74332TFg, 115));
            }
            this.LIZ.LJLLILLLL = interfaceC74334TFi;
            String uid = interfaceC74334TFi.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            ViewOnClickListenerC74332TFg.LLILIL = uid;
            if (o.LJ(this.LIZIZ, this.LIZ.LLIIL.LLJJIJIIJIL())) {
                ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg2 = this.LIZ;
                W5G w5g = viewOnClickListenerC74332TFg2.LLFZ;
                if (w5g != null) {
                    w5g.setVisibility(8);
                }
                C8HN c8hn3 = viewOnClickListenerC74332TFg2.LLI;
                if (c8hn3 != null) {
                    c8hn3.setVisibility(8);
                }
                W5G w5g2 = viewOnClickListenerC74332TFg2.LJLJLJ;
                o.LJI(w5g2);
                w5g2.setVisibility(0);
                C8HN c8hn4 = viewOnClickListenerC74332TFg2.LJLJLLL;
                o.LJI(c8hn4);
                c8hn4.setVisibility(0);
                LinearLayout linearLayout5 = viewOnClickListenerC74332TFg2.LLFII;
                o.LJI(linearLayout5);
                linearLayout5.setVisibility(0);
                if (viewOnClickListenerC74332TFg2.LLIL.LJII()) {
                    InterfaceC74334TFi interfaceC74334TFi2 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                    o.LJI(interfaceC74334TFi2);
                    if (!interfaceC74334TFi2.LIZJ()) {
                        InterfaceC74334TFi interfaceC74334TFi3 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                        o.LJI(interfaceC74334TFi3);
                        if (!interfaceC74334TFi3.LIZ()) {
                            C170736mz c170736mz2 = viewOnClickListenerC74332TFg2.LLF;
                            o.LJI(c170736mz2);
                            c170736mz2.setVisibility(0);
                        }
                    }
                }
                InterfaceC74334TFi interfaceC74334TFi4 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                o.LJI(interfaceC74334TFi4);
                String currentUserId = interfaceC74334TFi4.getCurrentUserId();
                InterfaceC74334TFi interfaceC74334TFi5 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                o.LJI(interfaceC74334TFi5);
                if (o.LJ(currentUserId, interfaceC74334TFi5.getUid())) {
                    C8HN c8hn5 = viewOnClickListenerC74332TFg2.LJLZ;
                    o.LJI(c8hn5);
                    c8hn5.setVisibility(8);
                }
                InterfaceC74334TFi interfaceC74334TFi6 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                o.LJI(interfaceC74334TFi6);
                boolean z = true;
                if (interfaceC74334TFi6.LIZLLL() == 1) {
                    InterfaceC74334TFi interfaceC74334TFi7 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                    o.LJI(interfaceC74334TFi7);
                    if (interfaceC74334TFi7.LIZIZ() == 1) {
                        C8HN c8hn6 = viewOnClickListenerC74332TFg2.LJLZ;
                        if (c8hn6 != null) {
                            Locale locale = Locale.getDefault();
                            Context context = viewOnClickListenerC74332TFg2.LJLJJL;
                            o.LJI(context);
                            String string = context.getString(R.string.gnr);
                            o.LJIIIIZZ(string, "mContext!!.getString(R.string.friends)");
                            String LLLZI = C16880lQ.LLLZI(locale, string, Arrays.copyOf(new Object[0], 0));
                            o.LJIIIIZZ(LLLZI, "java.lang.String.format(locale, format, *args)");
                            c8hn6.setText(LLLZI);
                            c8hn6.setBackgroundResource(R.drawable.but);
                            viewOnClickListenerC74332TFg2.LJZ = 1;
                        }
                    } else {
                        InterfaceC74334TFi interfaceC74334TFi8 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                        o.LJI(interfaceC74334TFi8);
                        if (interfaceC74334TFi8.LIZIZ() == 0 && (c8hn2 = viewOnClickListenerC74332TFg2.LJLZ) != null) {
                            Locale locale2 = Locale.getDefault();
                            Context context2 = viewOnClickListenerC74332TFg2.LJLJJL;
                            o.LJI(context2);
                            String string2 = context2.getString(R.string.gix);
                            o.LJIIIIZZ(string2, "mContext!!.getString(R.string.follow_back)");
                            String LLLZI2 = C16880lQ.LLLZI(locale2, string2, Arrays.copyOf(new Object[0], 0));
                            o.LJIIIIZZ(LLLZI2, "java.lang.String.format(locale, format, *args)");
                            c8hn2.setText(LLLZI2);
                            c8hn2.setBackgroundResource(R.drawable.bus);
                            viewOnClickListenerC74332TFg2.LJZ = 0;
                        }
                    }
                } else {
                    InterfaceC74334TFi interfaceC74334TFi9 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                    o.LJI(interfaceC74334TFi9);
                    if (interfaceC74334TFi9.LIZIZ() == 1) {
                        C8HN c8hn7 = viewOnClickListenerC74332TFg2.LJLZ;
                        if (c8hn7 != null) {
                            Locale locale3 = Locale.getDefault();
                            Context context3 = viewOnClickListenerC74332TFg2.LJLJJL;
                            o.LJI(context3);
                            String string3 = context3.getString(R.string.gkk);
                            o.LJIIIIZZ(string3, "mContext!!.getString(R.string.following)");
                            String LLLZI3 = C16880lQ.LLLZI(locale3, string3, Arrays.copyOf(new Object[0], 0));
                            o.LJIIIIZZ(LLLZI3, "java.lang.String.format(locale, format, *args)");
                            c8hn7.setText(LLLZI3);
                            c8hn7.setBackgroundResource(R.drawable.but);
                            viewOnClickListenerC74332TFg2.LJZ = 1;
                        }
                    } else {
                        InterfaceC74334TFi interfaceC74334TFi10 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                        o.LJI(interfaceC74334TFi10);
                        if (interfaceC74334TFi10.LIZIZ() == 0 && (c8hn = viewOnClickListenerC74332TFg2.LJLZ) != null) {
                            Locale locale4 = Locale.getDefault();
                            Context context4 = viewOnClickListenerC74332TFg2.LJLJJL;
                            o.LJI(context4);
                            String string4 = context4.getString(R.string.git);
                            o.LJIIIIZZ(string4, "mContext!!.getString(R.string.follow)");
                            String LLLZI4 = C16880lQ.LLLZI(locale4, string4, Arrays.copyOf(new Object[0], 0));
                            o.LJIIIIZZ(LLLZI4, "java.lang.String.format(locale, format, *args)");
                            c8hn.setText(LLLZI4);
                            c8hn.setBackgroundResource(R.drawable.bus);
                            viewOnClickListenerC74332TFg2.LJZ = 0;
                        }
                    }
                }
                C8HN c8hn8 = viewOnClickListenerC74332TFg2.LJLLI;
                if (c8hn8 != null) {
                    Locale locale5 = Locale.getDefault();
                    Context context5 = viewOnClickListenerC74332TFg2.LJLJJL;
                    o.LJI(context5);
                    String string5 = context5.getString(R.string.e8g);
                    o.LJIIIIZZ(string5, "mContext!!.getString(R.s…ools_effect_creator_text)");
                    InterfaceC74334TFi interfaceC74334TFi11 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                    o.LJI(interfaceC74334TFi11);
                    String LLLZI5 = C16880lQ.LLLZI(locale5, string5, Arrays.copyOf(new Object[]{interfaceC74334TFi11.getNickname()}, 1));
                    o.LJIIIIZZ(LLLZI5, "java.lang.String.format(locale, format, *args)");
                    c8hn8.setText(LLLZI5);
                    c8hn8.setVisibility(0);
                }
                C8HN c8hn9 = viewOnClickListenerC74332TFg2.LJLLLL;
                if (c8hn9 != null) {
                    InterfaceC74334TFi interfaceC74334TFi12 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                    o.LJI(interfaceC74334TFi12);
                    c8hn9.setText(interfaceC74334TFi12.getNickname());
                    c8hn9.setOnClickListener(new ViewOnClickListenerC13880ga(viewOnClickListenerC74332TFg2.LLIIIJ));
                }
                C8HN c8hn10 = viewOnClickListenerC74332TFg2.LJLLLLLL;
                if (c8hn10 != null) {
                    Locale locale6 = Locale.getDefault();
                    Context context6 = viewOnClickListenerC74332TFg2.LJLJJL;
                    o.LJI(context6);
                    String string6 = context6.getString(R.string.ibl);
                    o.LJIIIIZZ(string6, "mContext!!.getString(R.string.mus_fans_cnt)");
                    InterfaceC74334TFi interfaceC74334TFi13 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                    o.LJI(interfaceC74334TFi13);
                    String LLLZI6 = C16880lQ.LLLZI(locale6, string6, Arrays.copyOf(new Object[]{Integer.valueOf(interfaceC74334TFi13.getFollowCount())}, 1));
                    o.LJIIIIZZ(LLLZI6, "java.lang.String.format(locale, format, *args)");
                    c8hn10.setText(LLLZI6);
                }
                TextView textView2 = this.LIZ.LJLJI;
                if (textView2 != null) {
                    textView2.setText(interfaceC74334TFi.getNickname());
                }
                C8HN c8hn11 = this.LIZ.LJLLJ;
                if (c8hn11 != null) {
                    Locale locale7 = Locale.getDefault();
                    Context context7 = this.LIZ.LJLJJL;
                    o.LJI(context7);
                    String string7 = context7.getString(R.string.e8j);
                    o.LJIIIIZZ(string7, "mContext!!.getString(R.s…eation_tools_effect_text)");
                    String LLLZI7 = C16880lQ.LLLZI(locale7, string7, Arrays.copyOf(new Object[]{interfaceC74334TFi.getNickname()}, 1));
                    o.LJIIIIZZ(LLLZI7, "java.lang.String.format(locale, format, *args)");
                    c8hn11.setText(LLLZI7);
                }
                C78764Uvg.LJI(this.LIZ.LJLLL, interfaceC74334TFi.getAvatarThumb(), -1, -1);
                ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg3 = this.LIZ;
                String stickerId = this.LIZIZ.getDesignerId();
                String encryptedId = this.LIZIZ.getDesignerEncryptedId();
                if (interfaceC74334TFi.LIZLLL() != 1) {
                    z = false;
                }
                viewOnClickListenerC74332TFg3.getClass();
                o.LJIIIZ(stickerId, "stickerId");
                o.LJIIIZ(encryptedId, "encryptedId");
                C8HN c8hn12 = viewOnClickListenerC74332TFg3.LJLZ;
                if (c8hn12 != null) {
                    c8hn12.setOnClickListener(new ViewOnClickListenerC13880ga(new ViewOnClickListenerC74335TFj(viewOnClickListenerC74332TFg3, stickerId, encryptedId, z)));
                }
                ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg4 = this.LIZ;
                if (viewOnClickListenerC74332TFg4.LLIIIZ && (linearLayout = viewOnClickListenerC74332TFg4.LJLL) != null) {
                    linearLayout.setVisibility(0);
                }
                W5G w5g3 = this.LIZ.LJLJLJ;
                if (w5g3 != null) {
                    C78764Uvg.LJIIIZ(w5g3, (String) ORZ.LJLLLL(this.LIZIZ.getIconUrl().getUrlList()), -1, -1);
                }
                C8HN c8hn13 = this.LIZ.LJLJLLL;
                if (c8hn13 != null) {
                    c8hn13.setText(this.LIZIZ.getName());
                }
                ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg5 = this.LIZ;
                if (viewOnClickListenerC74332TFg5.LLIIIZ) {
                    W5G w5g4 = viewOnClickListenerC74332TFg5.LJLILLLLZI;
                    if (w5g4 != null) {
                        w5g4.setVisibility(8);
                    }
                } else {
                    W5G w5g5 = viewOnClickListenerC74332TFg5.LJLILLLLZI;
                    if (w5g5 != null) {
                        w5g5.setVisibility(0);
                        C78764Uvg.LJI(w5g5, interfaceC74334TFi.getAvatarThumb(), -1, -1);
                    }
                }
                ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg6 = this.LIZ;
                if (viewOnClickListenerC74332TFg6.LLIIIL && (textView = viewOnClickListenerC74332TFg6.LJLJI) != null) {
                    if (TextUtils.isEmpty(interfaceC74334TFi.getUniqueId())) {
                        if (interfaceC74334TFi.getShortId() == null) {
                            uniqueId = "";
                        } else {
                            uniqueId = interfaceC74334TFi.getShortId();
                        }
                        str = "if (user.shortId == null) \"\" else user.shortId";
                    } else {
                        uniqueId = interfaceC74334TFi.getUniqueId();
                        str = "user.uniqueId";
                    }
                    o.LJIIIIZZ(uniqueId, str);
                    textView.setText(uniqueId);
                }
            }
            this.LIZ.LJLJJLL.put(this.LIZIZ.getDesignerId(), interfaceC74334TFi);
        }
        return C76800UCe.LIZ;
    }
}
