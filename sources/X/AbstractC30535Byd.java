package X;

import Y.AObjectS42S0101000_5;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.Byd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC30535Byd extends PopupWindow {
    public static final /* synthetic */ int LJLJI = 0;
    public final DataChannel LJLIL;
    public final ViewGroup LJLILLLLZI;

    public abstract void LIZ();

    public AbstractC30535Byd(Context context, final DataChannel dataChannel, List list) {
        super(context);
        this.LJLIL = dataChannel;
        ViewGroup viewGroup = (ViewGroup) C16880lQ.LLLZIIL(R.layout.cwl, C16880lQ.LLZIL(context), null);
        this.LJLILLLLZI = viewGroup;
        setWidth(-1);
        setHeight(-2);
        setContentView(viewGroup);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setWindowLayoutMode(-1, -2);
        setAnimationStyle(R.style.aax);
        viewGroup.getBackground().setAlpha(255);
        EnumC30206BtK.POPUP.createHolder(dataChannel, (ViewGroup) viewGroup.findViewById(R.id.lcv), list, EnumC30226Bte.ICON_WITH_TEXT_EFFECT);
        dataChannel.lv0(dataChannel.LJLJJI, DismissToolbarPopEvent.class, new AObjectS42S0101000_5(1, this, 27));
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.BuV
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                EnumC30206BtK.POPUP.release(DataChannel.this);
            }
        });
    }
}
