package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.NamedValue;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemCardContentKt;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.Template;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.GwK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43132GwK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NamedValue info, LinearLayout container) {
        String timestamp;
        o.LJIIIZ(info, "info");
        o.LJIIIZ(container, "container");
        Context context = container.getContext();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(container.getContext()), R.layout.b7q, container, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (info.getValue().getParser() != null && o.LJ(info.getValue().getParser().getType(), "timestamp")) {
            timestamp = info.getValue().getTips();
            String format = info.getValue().getParser().getFormat();
            Locale locale = Locale.getDefault();
            o.LJIIIIZZ(locale, "getDefault()");
            TimeZone timeZone = TimeZone.getDefault();
            o.LJIIIIZZ(timeZone, "getDefault()");
            o.LJIIIZ(timestamp, "timestamp");
            o.LJIIIZ(format, "format");
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, locale);
                simpleDateFormat.setTimeZone(timeZone);
                String format2 = simpleDateFormat.format(new Date(CastLongProtector.parseLong(timestamp)));
                format2.toString();
                timestamp = format2;
            } catch (Exception unused) {
            }
        } else {
            timestamp = info.getValue().getTips();
        }
        spannableStringBuilder.append((CharSequence) info.getName()).append((CharSequence) " ").append((CharSequence) timestamp);
        List<Template> template = info.getValue().getTemplate();
        if (template == null) {
            template = C61878OQg.INSTANCE;
        }
        for (Template template2 : template) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("{{");
            LIZ2.append(template2.getKey());
            LIZ2.append("}}");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            int LJJLIIJ = s.LJJLIIJ(spannableStringBuilder, LIZIZ, 6);
            spannableStringBuilder.replace(LJJLIIJ, LIZIZ.length() + LJJLIIJ, (CharSequence) template2.getName()).setSpan(new ForegroundColorSpan(SystemCardContentKt.colorTypeToColor(Integer.valueOf(template2.getExtra().getColorType()))), LJJLIIJ, template2.getName().length() + LJJLIIJ, 33);
            if (template2.getExtra().getBold()) {
                spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIJ, template2.getName().length() + LJJLIIJ, 33);
            }
        }
        o.LJIIIIZZ(context, "context");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.gv, context)), 0, info.getName().length() + 1, 33);
        ((TextView) LLLLIILL.findViewById(R.id.ef3)).setText(spannableStringBuilder);
        container.addView(LLLLIILL);
    }
}
