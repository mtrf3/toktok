package Y;

import X.AnonymousClass852;
import X.C16880lQ;
import X.C2054084i;
import X.C2054384l;
import X.C2055684y;
import X.C2056385f;
import X.C2058586b;
import X.C47261Igj;
import X.C50420Jqa;
import X.C61878OQg;
import X.C76W;
import X.C79045V0n;
import X.C85M;
import X.C86R;
import X.FMX;
import X.M89;
import X.ORZ;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ACallableS34S1200000_3 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS34S1200000_3 aCallableS34S1200000_3) {
        List LJJIJIIJI;
        C2054084i c2054084i = (C2054084i) aCallableS34S1200000_3.l1;
        C2055684y c2055684y = c2054084i.LJLZ;
        TuxTextLayoutView tuxTextLayoutView = c2054084i.LJLLL;
        if (tuxTextLayoutView != null) {
            Context context = tuxTextLayoutView.getContext();
            o.LJIIIIZZ(context, "descView.context");
            String transData = aCallableS34S1200000_3.s0;
            c2055684y.getClass();
            o.LJIIIZ(transData, "transData");
            Iterable<? extends AnonymousClass852<C85M>> iterable = c2055684y.LJ;
            if (iterable == null) {
                return null;
            }
            if (C86R.LIZ()) {
                String string = context.getString(R.string.dal);
                o.LJIIIIZZ(string, "ctx\n            .getStri…nsTagAutoTranslate_title)");
                String LJJJJZ = ujb.o.LJJJJZ(string, "%s", "", false);
                Integer LJI = C79045V0n.LJI(R.attr.dl, context);
                if (LJI != null) {
                    int intValue = LJI.intValue();
                    C2056385f c2056385f = new C2056385f(LJJJJZ);
                    c2056385f.LJII.add(new ForegroundColorSpan(intValue));
                    LJJIJIIJI = C47261Igj.LJJIJIIJI(c2056385f, new C2056385f(transData));
                    C2054384l c2054384l = new C2054384l(ORZ.LLIIIZ(iterable, LJJIJIIJI));
                    c2055684y.LJFF = new C2058586b(c2054384l.LIZIZ(), transData, C61878OQg.INSTANCE);
                    return ((C2054084i) aCallableS34S1200000_3.l1).LIZJ(c2054384l, (Aweme) aCallableS34S1200000_3.l2);
                }
            }
            LJJIJIIJI = C47261Igj.LJJIJ(new C2056385f(transData));
            C2054384l c2054384l2 = new C2054384l(ORZ.LLIIIZ(iterable, LJJIJIIJI));
            c2055684y.LJFF = new C2058586b(c2054384l2.LIZIZ(), transData, C61878OQg.INSTANCE);
            return ((C2054084i) aCallableS34S1200000_3.l1).LIZJ(c2054384l2, (Aweme) aCallableS34S1200000_3.l2);
        }
        o.LJIJI("descView");
        throw null;
    }

    public static final Object call$1(ACallableS34S1200000_3 aCallableS34S1200000_3) {
        String str;
        String str2;
        C50420Jqa c50420Jqa = (C50420Jqa) aCallableS34S1200000_3.l1;
        String str3 = aCallableS34S1200000_3.s0;
        M89 m89 = (M89) aCallableS34S1200000_3.l2;
        int i = c50420Jqa.LJLIL;
        if (i == 19) {
            str = "head";
            str2 = "click_head";
        } else if (i == 18) {
            str = "name";
            str2 = "click_name";
        } else {
            str = "";
            str2 = "";
        }
        C76W c76w = new C76W();
        try {
            c76w.LIZ("group_id", ((Aweme) c50420Jqa.LJLILLLLZI).getAid());
            c76w.LIZ("request_id", str3);
            Aweme aweme = (Aweme) c50420Jqa.LJLILLLLZI;
            if (aweme != null && aweme.getAwemeType() == 2) {
                c76w.LIZ("is_photo", "1");
            }
            c76w.LIZ("to_user_id", ((Aweme) c50420Jqa.LJLILLLLZI).getAuthorUid());
            c76w.LIZ("author_id", ((Aweme) c50420Jqa.LJLILLLLZI).getAuthorUid());
            MobClick obtain = MobClick.obtain();
            obtain.setEventName(str);
            obtain.setLabelName(m89.getEventType());
            obtain.setValue(((Aweme) c50420Jqa.LJLILLLLZI).getAuthor().getUid());
            obtain.setJsonObject(c76w.LIZIZ());
            FMX.onEvent(obtain);
            c76w.LIZ("enter_from", m89.getEventType());
            c76w.LIZ("enter_method", str2);
            MobClick obtain2 = MobClick.obtain();
            obtain2.setEventName("enter_detail");
            obtain2.setLabelName("personal_homepage");
            obtain2.setValue(((Aweme) c50420Jqa.LJLILLLLZI).getAuthor().getUid());
            obtain2.setJsonObject(c76w.LIZIZ());
            FMX.onEvent(obtain2);
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public ACallableS34S1200000_3(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
