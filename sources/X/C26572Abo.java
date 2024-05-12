package X;

import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.graphics.Color;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PolicyStatement;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Abo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26572Abo extends ConstraintLayout {
    public final PolicyStatement LJLIL;
    public final boolean LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final boolean getHasDivider() {
        return this.LJLILLLLZI;
    }

    public final PolicyStatement getPolicyStatement() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26572Abo(Context context, PolicyStatement policyStatement, boolean z) {
        super(context, null, 0);
        int i;
        Integer LJI;
        List<Icon> icons;
        o.LJIIIZ(policyStatement, "policyStatement");
        this.LJLJI = new LinkedHashMap();
        this.LJLIL = policyStatement;
        this.LJLILLLLZI = z;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a1a, this, true);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.cdn);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
        LinkRichText statementText = policyStatement.getStatementText();
        if (statementText == null) {
            return;
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.hvz);
        String title = policyStatement.getTitle();
        textView.setText(title == null ? "" : title);
        try {
            String str = statementText.textColor;
            if (str != null) {
                LJI = Integer.valueOf(Color.parseColor(str));
            } else {
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                LJI = C79045V0n.LJI(R.attr.gu, context2);
            }
        } catch (Throwable unused) {
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            LJI = C79045V0n.LJI(R.attr.gu, context3);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.hvy);
        RichTextUtil richTextUtil = RichTextUtil.LIZ;
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        CharSequence LIZJ = RichTextUtil.LIZJ(richTextUtil, context4, statementText, LJI, 0, false, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        textView2.setText(LIZJ != null ? LIZJ : "");
        _$_findCachedViewById(R.id.hvy).setClickable(true);
        ((TextView) _$_findCachedViewById(R.id.hvy)).setMovementMethod(LinkMovementMethod.getInstance());
        if (!C1GE.LJIILIIL(this.LJLIL.getIcons()) || (icons = this.LJLIL.getIcons()) == null) {
            return;
        }
        _$_findCachedViewById(R.id.dj8).setVisibility(icons.isEmpty() ? 8 : 0);
        AqS151S0200000_4 aqS151S0200000_4 = new AqS151S0200000_4(this, (C26572Abo) icons, (List<Icon>) 53);
        if (_$_findCachedViewById(R.id.dj8).getWidth() == 0) {
            _$_findCachedViewById(R.id.dj8).post(new ARunnableS40S0100000_4((Object) aqS151S0200000_4, 156));
        } else {
            aqS151S0200000_4.invoke();
        }
    }
}
