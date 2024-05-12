package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class B9W extends FrameLayout {
    public DataChannel LJLIL;
    public final List<View> LJLILLLLZI;
    public InterfaceC28240B6m LJLJI;
    public View LJLJJI;
    public View LJLJJL;

    public void setDataChannel(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    public void setIView(InterfaceC28240B6m interfaceC28240B6m) {
        this.LJLJI = interfaceC28240B6m;
    }

    public B9W(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList(4);
        this.LJLILLLLZI = arrayList;
        C16880lQ.LLLZIIL(R.layout.dlk, C16880lQ.LLZIL(context), this);
        arrayList.add(findViewById(R.id.et2));
        arrayList.add(findViewById(R.id.et3));
        arrayList.add(findViewById(R.id.et4));
        arrayList.add(findViewById(R.id.et5));
        this.LJLJJI = findViewById(R.id.cd9);
        this.LJLJJL = findViewById(R.id.ap_);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B9W.LIZ(int, java.util.List):void");
    }
}
