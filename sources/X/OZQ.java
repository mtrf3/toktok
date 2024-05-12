package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.qrcode.channel.CopyLinkChannelWithBPEA;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZQ extends FrameLayout {
    public OZI LJLIL;

    public final void setCallback(OZI callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLIL = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OZQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        boolean z = false;
        if (L12.LIZJ()) {
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cml, this, true);
        } else {
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cmk, this, true);
        }
        C113914dX c113914dX = (C113914dX) findViewById(R.id.n07);
        C16880lQ.LJIIJ(OZR.LJLIL, findViewById(R.id.jv9));
        if (c113914dX != null) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            List LJ = C62275OcJ.LJ(C78609UtB.LJJLIIIJ(context2));
            ArrayList arrayList = (ArrayList) LJ;
            arrayList.add(new C62108OZc());
            AbstractC65550Po2 LIZ = AbstractC65550Po2.LIZ(new C62355Odb((String) null, z, 14));
            ORS.LJJLIL(new AqS176S0100000_10(this, 13), LJ);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                InterfaceC62225ObV interfaceC62225ObV = (InterfaceC62225ObV) next;
                if (C62275OcJ.LIZIZ().isEmpty() || o.LJ(interfaceC62225ObV.key(), "general_qr_code") || o.LJ(interfaceC62225ObV.key(), "copy") || C62275OcJ.LIZIZ().contains(interfaceC62225ObV.key())) {
                    arrayList2.add(next);
                }
            }
            List<? extends InterfaceC62225ObV> LIZIZ = LIZ.LIZIZ(arrayList2);
            if ((L12.LIZ() == 3 || L12.LIZ() == 0 || L12.LIZ() == 1) && (L12.LIZ() == 2 || L12.LIZ() == 3 || L12.LIZ() == 4)) {
                ListProtector.add(LIZIZ, 0, new CopyLinkChannelWithBPEA(0));
            }
            c113914dX.LJIIJ(LIZIZ, false);
            c113914dX.LJLJJL = new OZJ(this);
        }
    }
}
