package X;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestFragment;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.4Sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109674Sd extends C1BD {
    public final List<EnumC97443s4> LJLJLJ;
    public final Resources LJLJLLL;
    public final java.util.Map<EnumC97443s4, String> LJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJLJ.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        EnumC97443s4 enumC97443s4;
        String str;
        if (i != 0) {
            if (i == 1) {
                enumC97443s4 = EnumC97443s4.FILTERED;
            }
            return "";
        }
        enumC97443s4 = EnumC97443s4.REGULAR;
        if (enumC97443s4 == null || (str = (String) ((LinkedHashMap) this.LJLL).get(enumC97443s4)) == null) {
            return "";
        }
        return str;
    }

    @Override // X.C1BD
    public final Fragment LJJIII(int i) {
        MessageRequestFragment messageRequestFragment = new MessageRequestFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("STRANGER_REQUEST_TYPE", ((EnumC97443s4) ListProtector.get(this.LJLJLJ, i)).ordinal());
        bundle.putInt("STRANGER_REQUEST_INDEX", i);
        boolean z = true;
        if (this.LJLJLJ.size() <= 1) {
            z = false;
        }
        bundle.putBoolean("TAB_LAYOUT_VISIBLE", z);
        messageRequestFragment.setArguments(bundle);
        return messageRequestFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIIJ(int r7, X.EnumC97443s4 r8) {
        /*
            r6 = this;
            int r0 = X.C4T4.LIZ()
            r5 = 0
            r4 = 1
            if (r0 < r4) goto L58
            r0 = 1
        L9:
            r2 = 2
            if (r0 == 0) goto L1f
            int[] r1 = X.C109714Sh.LIZ
            int r0 = r8.ordinal()
            r0 = r1[r0]
            if (r0 == r4) goto L34
            if (r0 == r2) goto L1b
        L18:
            java.lang.String r1 = ""
        L1a:
            return r1
        L1b:
            r3 = 2131821022(0x7f1101de, float:1.9274775E38)
            goto L37
        L1f:
            int[] r1 = X.C109714Sh.LIZ
            int r0 = r8.ordinal()
            r0 = r1[r0]
            if (r0 == r4) goto L30
            if (r0 == r2) goto L2c
            goto L18
        L2c:
            r3 = 2131832638(0x7f112f3e, float:1.9298335E38)
            goto L37
        L30:
            r3 = 2131832632(0x7f112f38, float:1.9298323E38)
            goto L37
        L34:
            r3 = 2131821044(0x7f1101f4, float:1.927482E38)
        L37:
            int r0 = X.C4T4.LIZ()
            if (r0 < r4) goto L51
            android.content.res.Resources r2 = r6.LJLJLLL
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1[r5] = r0
            java.lang.String r1 = r2.getString(r3, r1)
        L4b:
            java.lang.String r0 = "{\n            if (Messag…)\n            }\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L1a
        L51:
            android.content.res.Resources r0 = r6.LJLJLLL
            java.lang.String r1 = r0.getString(r3)
            goto L4b
        L58:
            r0 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109674Sd.LJJIIJ(int, X.3s4):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C109674Sd(FragmentManager fragmentManager, List<? extends EnumC97443s4> list, Resources resources) {
        super(fragmentManager, 0);
        this.LJLJLJ = list;
        this.LJLJLLL = resources;
        this.LJLL = new LinkedHashMap();
        for (EnumC97443s4 enumC97443s4 : list) {
            this.LJLL.put(enumC97443s4, LJJIIJ(0, enumC97443s4));
        }
    }
}
