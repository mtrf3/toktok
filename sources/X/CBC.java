package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CBC extends CSX<CBD> {
    public final TextView LJLJLLL;
    public final TextView LJLL;
    public DataChannel LJLLI;

    public final boolean N() {
        Integer num;
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel == null || (num = (Integer) dataChannel.kv0(BCH.class)) == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBC(View itemView) {
        super(itemView);
        DataChannel dataChannel;
        o.LJIIIZ(itemView, "itemView");
        this.LJLJLLL = (TextView) itemView.findViewById(R.id.kqf);
        this.LJLL = (TextView) itemView.findViewById(R.id.kqb);
        CQQ cqq = this.LJLILLLLZI;
        if (cqq != null) {
            dataChannel = cqq.LJIIIIZZ;
        } else {
            dataChannel = null;
        }
        this.LJLLI = dataChannel;
        if (dataChannel != null) {
            dataChannel.kv0(RoomChannel.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x029c, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "unfinished_on_boarding") != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03c4, code lost:
    
        if (r8 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if (r8 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0110, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, "sub_gift_anchor_remaining_present_notice") != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021d  */
    @Override // X.CSF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(X.CQQ r16, X.CRD r17) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CBC.L(X.CQQ, X.CRD):void");
    }
}
