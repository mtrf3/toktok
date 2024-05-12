package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.TextHighlight;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gru, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42858Gru extends RecyclerView.ViewHolder {
    public final C42848Grk LJLIL;
    public final InterfaceC42865Gs1 LJLILLLLZI;
    public final C164106cI LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final C164106cI LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42858Gru(View view, C42848Grk c42848Grk, InterfaceC42865Gs1 listener) {
        super(view);
        o.LJIIIZ(listener, "listener");
        this.LJLIL = c42848Grk;
        this.LJLILLLLZI = listener;
        this.LJLJI = (C164106cI) view.findViewById(R.id.f85);
        this.LJLJJI = (TextView) view.findViewById(R.id.mcv);
        this.LJLJJL = (TextView) view.findViewById(R.id.mcu);
        this.LJLJJLL = (C164106cI) view.findViewById(R.id.f84);
    }

    public static Spannable L(Context context, String str, List list) {
        SpannableString spannableString = new SpannableString(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TextHighlight textHighlight = (TextHighlight) it.next();
            Integer startIndex = textHighlight.getStartIndex();
            if (startIndex != null) {
                int intValue = startIndex.intValue();
                Integer endIndex = textHighlight.getEndIndex();
                if (endIndex != null) {
                    int intValue2 = endIndex.intValue();
                    if (context != null) {
                        spannableString.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.eb, context)), intValue, intValue2, 33);
                    }
                }
            }
        }
        return spannableString;
    }
}
