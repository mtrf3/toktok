package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.ONm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61806ONm implements TextWatcher {
    public final /* synthetic */ C61800ONg LJLIL;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C61806ONm(C61800ONg c61800ONg) {
        this.LJLIL = c61800ONg;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TuxIconView tuxIconView = this.LJLIL.LJIJI;
        if (tuxIconView != null) {
            int i4 = 0;
            if (charSequence == null || charSequence.length() <= 0) {
                i4 = 8;
            }
            tuxIconView.setVisibility(i4);
        }
        this.LJLIL.LJJII = String.valueOf(charSequence);
        C61800ONg c61800ONg = this.LJLIL;
        for (Map.Entry entry : ((LinkedHashMap) c61800ONg.LIZ).entrySet()) {
            ((Number) entry.getKey()).intValue();
            Option option = (Option) entry.getValue();
            if (option.getType() == EnumC46455ILb.WITH_INPUT.getType()) {
                String str = c61800ONg.LJJII;
                if (str == null) {
                    str = "";
                }
                option.setAdditional_content(str);
            }
        }
    }
}
