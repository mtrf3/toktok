package Y;

import X.C10I;
import X.C10K;
import X.C16880lQ;
import X.C176386w6;
import X.C27740Aue;
import X.C61491OBj;
import X.C73340SqO;
import X.C76800UCe;
import X.InterfaceC73573Su9;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.assem.addiction.AntiAddictionToastAssem;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public class AgS121S0100000_3 implements C10I {
    public final int $t;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            default:
                return null;
        }
    }

    public AgS121S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(AgS121S0100000_3 agS121S0100000_3, C10K c10k) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) agS121S0100000_3.l0;
        Object LJIIJJI = c10k.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "it.result");
        interfaceC88472Yns.invoke(LJIIJJI);
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS121S0100000_3 agS121S0100000_3, C10K c10k) {
        if (!c10k.LJIILJJIL()) {
            C176386w6 c176386w6 = (C176386w6) agS121S0100000_3.l0;
            CommentItemList commentItemList = (CommentItemList) c10k.LJIIJJI();
            c176386w6.LJIILL(commentItemList);
            return commentItemList;
        }
        throw c10k.LJIIJ();
    }

    public static final Object then$2(AgS121S0100000_3 agS121S0100000_3, C10K c10k) {
        if (!c10k.LJIILJJIL() && c10k.LJIILIIL()) {
            ((InterfaceC73573Su9) agS121S0100000_3.l0).onNext(c10k.LJIIJJI());
            return C76800UCe.LIZ;
        }
        return Boolean.valueOf(((InterfaceC73573Su9) agS121S0100000_3.l0).tryOnError(c10k.LJIIJ()));
    }

    public static final Object then$3(AgS121S0100000_3 agS121S0100000_3, C10K c10k) {
        TextView textView;
        SimpleDateFormat simpleDateFormat;
        ViewGroup viewGroup = ((AntiAddictionToastAssem) agS121S0100000_3.l0).LLIFFJFJJ;
        String str = null;
        if (viewGroup != null && (textView = (TextView) viewGroup.findViewById(R.id.lz4)) != null) {
            String charSequence = textView.getText().toString();
            if (charSequence.length() != 0) {
                Context context = ((AntiAddictionToastAssem) agS121S0100000_3.l0).getContext();
                if (context != null) {
                    str = context.getString(R.string.bkd);
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                Date date = new Date(System.currentTimeMillis());
                ((AntiAddictionToastAssem) agS121S0100000_3.l0).getClass();
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("anti_addiction_toast_enable_24hour_time", false)) {
                    simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
                } else {
                    simpleDateFormat = new SimpleDateFormat("hh:mm aa", Locale.ENGLISH);
                }
                String format = simpleDateFormat.format(date);
                if (format != null) {
                    str2 = format;
                }
                String LLLZ = C16880lQ.LLLZ(str, Arrays.copyOf(new Object[]{str2, charSequence}, 2));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                textView.setText(LLLZ);
                C61491OBj LJIJJLI = C73340SqO.LJIJJLI();
                ViewGroup viewGroup2 = ((AntiAddictionToastAssem) agS121S0100000_3.l0).LLIFFJFJJ;
                LJIJJLI.getClass();
                C61491OBj.LJJZ(viewGroup2, 0, 360, true);
                if (C27740Aue.LJFF(((AntiAddictionToastAssem) agS121S0100000_3.l0).LLIFFJFJJ)) {
                    ((AntiAddictionToastAssem) agS121S0100000_3.l0).q4().LJLL = true;
                }
                a.LIZLLL().LJI();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$4(AgS121S0100000_3 agS121S0100000_3, C10K c10k) {
        AntiAddictionToastAssem antiAddictionToastAssem = (AntiAddictionToastAssem) agS121S0100000_3.l0;
        ViewGroup viewGroup = antiAddictionToastAssem.LLIFFJFJJ;
        if (viewGroup != null) {
            C61491OBj LJIJJLI = C73340SqO.LJIJJLI();
            int i = -viewGroup.getHeight();
            LJIJJLI.getClass();
            C61491OBj.LJJZ(viewGroup, i, 360, false);
            BottomBarPriorityAbility bottomBarPriorityAbility = (BottomBarPriorityAbility) antiAddictionToastAssem.LLFII.getValue();
            if (bottomBarPriorityAbility != null) {
                bottomBarPriorityAbility.Wf0();
                return C76800UCe.LIZ;
            }
        }
        return null;
    }
}
