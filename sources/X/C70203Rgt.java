package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NavButton;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rgt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70203Rgt extends AbstractC70204Rgu {
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractC70204Rgu
    public int getLayoutId() {
        return R.layout.xz;
    }

    private final void setButtonStyle(NavButton navButton) {
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.b1h);
        sy4.setMaxLines(2);
        sy4.setSupportClickWhenDisable(true);
        sy4.setText(navButton.text);
        Integer num = navButton.style;
        int value = EnumC70180RgW.BUY_STYLE.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC70180RgW.CART_STYLE.getValue();
            if (num == null || num.intValue() != value2) {
                int value3 = EnumC70180RgW.GRAY.getValue();
                if (num == null || num.intValue() != value3) {
                    sy4.setEnabled(false);
                    Context context = sy4.getContext();
                    o.LJIIIIZZ(context, "context");
                    sy4.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cf, context));
                    Context context2 = sy4.getContext();
                    o.LJIIIIZZ(context2, "context");
                    sy4.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context2));
                    return;
                }
                sy4.setEnabled(false);
                Context context3 = sy4.getContext();
                o.LJIIIIZZ(context3, "context");
                sy4.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cf, context3));
                Context context4 = sy4.getContext();
                o.LJIIIIZZ(context4, "context");
                sy4.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context4));
                return;
            }
            sy4.setEnabled(true);
            sy4.setButtonVariant(4);
            return;
        }
        sy4.setEnabled(true);
        sy4.setButtonVariant(0);
        Context context5 = sy4.getContext();
        o.LJIIIIZZ(context5, "context");
        sy4.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context5));
    }

    public final void setData(NavButton navButton) {
        o.LJIIIZ(navButton, "navButton");
        setNavButton(navButton);
        Integer num = navButton.style;
        int value = EnumC70180RgW.ICON_WITH_TEXT.getValue();
        if (num == null || num.intValue() != value) {
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.g3w));
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.b1h));
            setButtonStyle(navButton);
            return;
        }
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.g3w));
        C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.b1h));
        SmartImageView smartImageView = (SmartImageView) _$_findCachedViewById(R.id.ecz);
        W5F LJFF = W5U.LJFF(UriProtector.parse(navButton.icon));
        LJFF.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LJFF);
        ((TextView) _$_findCachedViewById(R.id.ecs)).setText(navButton.text);
    }

    public C70203Rgt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
