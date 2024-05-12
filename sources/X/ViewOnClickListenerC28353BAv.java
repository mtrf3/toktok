package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BAv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC28353BAv extends LinearLayout implements View.OnClickListener {
    public final int[] LJLIL;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLILLLLZI;
    public int LJLJI;
    public DataChannel LJLJJI;
    public final C62822Ol8 LJLJJL;

    private final HashMap<Integer, String> getColorNameMap() {
        return (HashMap) this.LJLJJL.getValue();
    }

    public final String getCurrentSelectedColorString() {
        if (getColorNameMap().containsKey(Integer.valueOf(this.LJLJI))) {
            String str = getColorNameMap().get(Integer.valueOf(this.LJLJI));
            o.LJI(str);
            return str;
        }
        return "";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long l;
        Long l2;
        if (view == null) {
            return;
        }
        if (R.id.c0r != view.getId()) {
            for (int i : this.LJLIL) {
                C31481CXd c31481CXd = (C31481CXd) findViewById(i);
                if (i == view.getId()) {
                    this.LJLJI = c31481CXd.getColor();
                    DataChannel dataChannel = this.LJLJJI;
                    if (dataChannel != null && (l = (Long) dataChannel.kv0(DrawGuessSessionIdChannel.class)) != null) {
                        long longValue = l.longValue();
                        DataChannel dataChannel2 = this.LJLJJI;
                        if (dataChannel2 != null && (l2 = (Long) dataChannel2.kv0(DrawGuessRoundIdChannel.class)) != null) {
                            long longValue2 = l2.longValue();
                            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_pictionary_change_color");
                            LIZ.LJIIZILJ();
                            LIZ.LJIJJ(Long.valueOf(longValue), "pictionary_session_id");
                            LIZ.LJIJJ(Long.valueOf(longValue2), "pictionary_id");
                            LIZ.LJIJJ(getCurrentSelectedColorString(), "color");
                            BAI.LIZ(LIZ);
                            BAI.LJIIJJI(LIZ, this.LJLJJI);
                            LIZ.LJJIIJZLJL();
                        }
                    }
                    if (!c31481CXd.LJLILLLLZI) {
                        c31481CXd.LJLILLLLZI = true;
                        c31481CXd.invalidate();
                    }
                } else if (c31481CXd.LJLILLLLZI) {
                    c31481CXd.LJLILLLLZI = false;
                    c31481CXd.invalidate();
                }
            }
        }
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(this.LJLJI));
        }
    }

    public final void setOnClickListener(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC28353BAv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
        int i = 0;
        int[] iArr = {R.id.niq, R.id.isx, R.id.amz, R.id.dyf, R.id.nkl, R.id.hq4};
        this.LJLIL = iArr;
        this.LJLJI = -1;
        this.LJLJJL = C221108m2.LIZIZ(C28354BAw.LJLIL);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.d22, this, true);
        do {
            C16880lQ.LJIIJ(this, findViewById(iArr[i]));
            i++;
        } while (i < 6);
    }
}
