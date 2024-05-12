package X;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.sheet.SheetDemoFragment;
import com.bytedance.android.livesdk.sheet.SheetLoremFragment;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import ujb.o;

/* renamed from: X.UXu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnClickListenerC77362UXu implements View.OnClickListener {
    public final /* synthetic */ SheetDemoFragment LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    public ViewOnClickListenerC77362UXu(View view, SheetDemoFragment sheetDemoFragment) {
        this.LJLIL = sheetDemoFragment;
        this.LJLILLLLZI = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        Bundle Ql = this.LJLIL.Ql();
        SheetDemoFragment sheetDemoFragment = this.LJLIL;
        Editable text = ((C19K) sheetDemoFragment._$_findCachedViewById(R.id.g_s)).getText();
        if (text == null || o.LJJJJJL(text)) {
            i = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        } else {
            i = CastIntegerProtector.parseInt(String.valueOf(((C19K) sheetDemoFragment._$_findCachedViewById(R.id.g_s)).getText()));
        }
        Ql.putInt("character_count", i);
        Ql.putBoolean("is_lorem", true);
        if (this.LJLIL.LLFII.isEmpty()) {
            C12830et LJI = C32044Chs.LJI(this.LJLILLLLZI);
            if (LJI != null) {
                LJI.LJIIIIZZ(SheetLoremFragment.class, SheetLoremFragment.class.getName(), this.LJLIL.Rl(), Ql);
                return;
            }
            return;
        }
        C12830et LJI2 = C32044Chs.LJI(this.LJLILLLLZI);
        if (LJI2 == null) {
            return;
        }
        LJI2.LJIIIIZZ(SheetDemoFragment.class, SheetDemoFragment.class.getName(), this.LJLIL.Rl(), Ql);
    }
}
