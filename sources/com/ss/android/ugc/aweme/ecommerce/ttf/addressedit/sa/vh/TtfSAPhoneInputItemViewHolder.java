package com.ss.android.ugc.aweme.ecommerce.ttf.addressedit.sa.vh;

import X.C27021Aj3;
import X.C27486AqY;
import X.C40689Fy1;
import X.C44878HjO;
import X.C71731SDf;
import X.C78857UxB;
import X.ORZ;
import X.OSZ;
import X.X1D;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class TtfSAPhoneInputItemViewHolder extends PhoneInputItemViewHolder {
    public Map<Integer, View> _$_findViewCache;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder
    public void handleInputBeforeVerify() {
        Object obj;
        Character LLI;
        OSZ osz;
        Object obj2 = ((C27021Aj3) getItem()).LIZIZ;
        if (!(obj2 instanceof OSZ) || (osz = (OSZ) obj2) == null || (obj = osz.getSecond()) == null) {
            obj = ((C27021Aj3) getItem()).LIZIZ;
        }
        if (obj instanceof String) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() == 0) {
                return;
            }
            String str = (String) ORZ.LJLLLLLL(1, s.LJLJJI(charSequence, new char[]{')'}, false, 6));
            if (!C78857UxB.LJJJIL(str) || str.length() != 10 || C40689Fy1.LLFII(str) != '0' || (LLI = C40689Fy1.LLI(1, str)) == null || LLI.charValue() != '5') {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((String) ORZ.LJLLLLLL(0, s.LJLJJI(charSequence, new char[]{')'}, false, 6)));
            LIZ.append(')');
            String substring = str.substring(1, str.length());
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            LIZ.append(substring);
            String LIZIZ = X1D.LIZIZ(LIZ);
            TextView textView = (TextView) ((C71731SDf) ((C27486AqY) this.itemView.findViewById(R.id.hni)).LIZ(R.id.bwr)).LIZ(R.id.eof);
            String substring2 = str.substring(1, str.length());
            o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            textView.setText(substring2);
            Object obj3 = ((C27021Aj3) getItem()).LIZIZ;
            if ((obj3 instanceof OSZ) && obj3 != null) {
                ((C27021Aj3) getItem()).LIZIZ = new OSZ(((OSZ) obj3).getFirst(), LIZIZ);
            } else {
                ((C27021Aj3) getItem()).LIZIZ = LIZIZ;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfSAPhoneInputItemViewHolder(ViewGroup viewGroup) {
        super(viewGroup);
        this._$_findViewCache = C44878HjO.LIZIZ(viewGroup, "parent");
    }
}
