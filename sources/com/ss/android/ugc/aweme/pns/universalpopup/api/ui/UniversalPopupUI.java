package com.ss.android.ugc.aweme.pns.universalpopup.api.ui;

import X.C221108m2;
import X.C62822Ol8;
import X.C8GL;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes4.dex */
public abstract class UniversalPopupUI extends Fragment {
    public C8GL LJLILLLLZI;
    public final AtomicBoolean LJLIL = new AtomicBoolean(false);
    public final int LJLJI = 4097;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 677));

    public abstract void Al(SpannableStringBuilder spannableStringBuilder);

    public abstract void Dl(List list, Boolean bool, AqS169S0100000_3 aqS169S0100000_3);

    public abstract void Gl(String str, String str2);

    public abstract void Hl(String str);

    public abstract void xl(Map<String, String> map);

    public final UniversalPopup wl() {
        return (UniversalPopup) this.LJLJJI.getValue();
    }

    public int vl() {
        return this.LJLJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0074, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int, boolean] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
