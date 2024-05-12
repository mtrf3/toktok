package X;

import Y.ACListenerS23S0100100_5;
import Y.ALAdapterS4S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS53S0100000_1;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMaskLayerCheckSetting;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Beo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29306Beo {
    public static long LIZ;

    public static final boolean LJIIZILJ(int i) {
        return i == 0 || i == 8 || i == 6 || i == 11;
    }

    public static final boolean LJIJ(int i) {
        return i == 1 || i == 7 || i == 9 || i == 12;
    }

    public static final int LJJLIIJ(float f) {
        int i = (int) f;
        return ((double) (f - ((float) i))) < 0.5d ? i : i + 1;
    }

    public static final boolean LJIILJJIL() {
        Boolean bool;
        EnumC29309Ber enumC29309Ber = (EnumC29309Ber) DataChannelGlobal.LJLJJI.mv0(BroadcastPageChannel.class);
        if (enumC29309Ber != null) {
            bool = Boolean.valueOf(enumC29309Ber.isBroadCastPage());
        } else {
            bool = null;
        }
        return LJJIFFI(bool);
    }

    public static final boolean LJIILL() {
        Boolean bool;
        EnumC29309Ber enumC29309Ber = (EnumC29309Ber) DataChannelGlobal.LJLJJI.mv0(BroadcastPageChannel.class);
        if (enumC29309Ber != null) {
            bool = Boolean.valueOf(enumC29309Ber.isVideoPage());
        } else {
            bool = null;
        }
        return LJJIFFI(bool);
    }

    public static final boolean LJJI() {
        Boolean bool;
        EnumC29309Ber enumC29309Ber = (EnumC29309Ber) DataChannelGlobal.LJLJJI.mv0(BroadcastPageChannel.class);
        if (enumC29309Ber != null) {
            bool = Boolean.valueOf(enumC29309Ber.isPreviewPage());
        } else {
            bool = null;
        }
        return LJJIFFI(bool);
    }

    public static final boolean LJIJI() {
        return o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ());
    }

    public static final ActivityC45651qj LIZ(Context context) {
        ActivityC45651qj LIZIZ = LIZIZ(context);
        if (LIZIZ == null) {
            Activity topActivity = ((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity();
            if (topActivity != null) {
                return LIZIZ(topActivity);
            }
            return null;
        }
        return LIZIZ;
    }

    public static final ActivityC45651qj LIZIZ(Context context) {
        if (context instanceof ActivityC45651qj) {
            return (ActivityC45651qj) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZIZ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final ActivityC45651qj LIZJ(Context context) {
        o.LJIIIZ(context, "<this>");
        ActivityC45651qj LIZ2 = LIZ(context);
        if (LIZ2 == null) {
            return null;
        }
        return LIZ2;
    }

    public static final void LIZLLL(C47061t0 c47061t0) {
        if (c47061t0 != null) {
            c47061t0.animate().alpha(0.0f).setDuration(150L).setListener(new ALAdapterS4S0100000_5(c47061t0, 56));
        }
    }

    public static final FragmentManager LJFF(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        }
        return null;
    }

    public static final void LJI(View view) {
        if (view != null && view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    public static final void LJII(LiveEditText liveEditText) {
        InputMethodManager inputMethodManager;
        Context context = liveEditText.getContext();
        Object obj = null;
        if (context != null) {
            obj = C16880lQ.LLILL(context, "input_method");
        }
        if ((obj instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) obj) != null) {
            inputMethodManager.hideSoftInputFromWindow(liveEditText.getWindowToken(), 0);
        }
    }

    public static final void LJIIIZ(View view) {
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
    }

    public static final boolean LJIIJ(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
        } else {
            bool = null;
        }
        return LJJIFFI(bool);
    }

    public static final boolean LJIIJJI(DataChannelGlobal dataChannelGlobal) {
        Boolean bool;
        o.LJIIIZ(dataChannelGlobal, "<this>");
        EnumC29309Ber enumC29309Ber = (EnumC29309Ber) dataChannelGlobal.mv0(BroadcastPageChannel.class);
        if (enumC29309Ber != null) {
            bool = Boolean.valueOf(enumC29309Ber.isAudience());
        } else {
            bool = null;
        }
        return LJIILLIIL(bool);
    }

    public static final boolean LJIIL(DataChannel dataChannel) {
        return !LJIIJ(dataChannel);
    }

    public static final boolean LJIILIIL(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BCR.class)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean LJIILLIIL(Boolean bool) {
        return o.LJ(bool, Boolean.FALSE);
    }

    public static final boolean LJIJJ(Room room) {
        MaskLayer maskLayer;
        Text text;
        String str;
        MaskLayer maskLayer2;
        Text text2;
        String str2;
        if (LiveMaskLayerCheckSetting.INSTANCE.enable()) {
            if (room == null || (maskLayer = room.maskLayer) == null || (text = maskLayer.title) == null || (str = text.defaultPattern) == null || str.length() == 0 || room == null || (maskLayer2 = room.maskLayer) == null || (text2 = maskLayer2.subTitle) == null || (str2 = text2.defaultPattern) == null || str2.length() == 0) {
                return true;
            }
        } else if (room == null || room.maskLayer == null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJLI(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIL(Boolean bool) {
        return !o.LJ(bool, Boolean.TRUE);
    }

    public static final boolean LJJ(Boolean bool) {
        return !o.LJ(bool, Boolean.FALSE);
    }

    public static final boolean LJJIFFI(Boolean bool) {
        return o.LJ(bool, Boolean.TRUE);
    }

    public static final boolean LJJII(DataChannel dataChannel) {
        Boolean bool;
        if (LJIIJ(dataChannel)) {
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.kv0(BDR.class);
            } else {
                bool = null;
            }
            if (LJJIFFI(bool)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIII(ActivityC45651qj activityC45651qj) {
        Boolean bool;
        if (activityC45651qj != null) {
            bool = Boolean.valueOf(activityC45651qj.isFinishing());
        } else {
            bool = null;
        }
        return LJIILLIIL(bool);
    }

    public static final boolean LJJIIJ(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static final long LJJIJ(DataChannel dataChannel) {
        Long l;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(C29308Beq.class)) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final void LJJIJIIJIL(View view) {
        ViewParent parent;
        if (view != null && (parent = view.getParent()) != null && (parent instanceof ViewGroup)) {
            C16880lQ.LJLLL(view, (ViewGroup) parent);
        }
    }

    public static final Room LJJIJLIJ(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Room) dataChannel.kv0(RoomChannel.class);
        }
        return null;
    }

    public static final Room LJJIL(DataChannelGlobal dataChannelGlobal) {
        o.LJIIIZ(dataChannelGlobal, "<this>");
        return (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
    }

    public static final long LJJIZ(DataChannel dataChannel) {
        Long l;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(BCN.class)) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final void LJJJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!LJIJI()) {
            C15610jN.LIZ().post(new ARunnableS41S0100000_5(interfaceC65784Pro, 256));
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LJJJIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C15610jN.LIZIZ(new ARunnableS41S0100000_5(interfaceC65784Pro, 256));
    }

    public static final void LJJJJ(Dialog dialog) {
        if (dialog != null && LJJIII(LIZIZ(dialog.getContext())) && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public static final void LJJJJI(InterfaceC92693kP interfaceC92693kP) {
        if (interfaceC92693kP != null && (!interfaceC92693kP.isDisposed())) {
            interfaceC92693kP.dispose();
        }
    }

    public static final void LJJJJIZL(Dialog dialog) {
        if (dialog != null && LJJIII(LIZIZ(dialog.getContext())) && !dialog.isShowing()) {
            C16880lQ.LIZ(dialog);
        }
    }

    public static final Integer LJJJJJ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        if (z) {
            return null;
        }
        try {
            num = Integer.valueOf(CastIntegerProtector.parseInt(str));
            return num;
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("String.safeToInt error: ");
            LIZ2.append(th);
            C0NB.LJ("KtUtil", X1D.LIZIZ(LIZ2));
            return num;
        }
    }

    public static final void LJJLIIIJL(EditText editText) {
        InputMethodManager inputMethodManager;
        o.LJIIIZ(editText, "<this>");
        Context context = editText.getContext();
        Object obj = null;
        if (context != null) {
            obj = C16880lQ.LLILL(context, "input_method");
        }
        if ((obj instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) obj) != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJJLIIIJLLLLLLLZ(java.lang.String r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case 48: goto L57;
                case 49: goto L4b;
                case 50: goto Lc;
                case 51: goto L3f;
                case 52: goto L33;
                case 53: goto L27;
                case 54: goto L1b;
                case 55: goto Lf;
                default: goto Lc;
            }
        Lc:
            java.lang.String r0 = "null"
        Le:
            return r0
        Lf:
            java.lang.String r0 = "7"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L18
            goto Lc
        L18:
            java.lang.String r0 = "live_voice"
            goto Le
        L1b:
            java.lang.String r0 = "6"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L24
            goto Lc
        L24:
            java.lang.String r0 = "live_studio"
            goto Le
        L27:
            java.lang.String r0 = "5"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L30
            goto Lc
        L30:
            java.lang.String r0 = "social_live"
            goto Le
        L33:
            java.lang.String r0 = "4"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3c
            goto Lc
        L3c:
            java.lang.String r0 = "screen_share"
            goto Le
        L3f:
            java.lang.String r0 = "3"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L48
            goto Lc
        L48:
            java.lang.String r0 = "audio"
            goto Le
        L4b:
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L54
            goto Lc
        L54:
            java.lang.String r0 = "third_party"
            goto Le
        L57:
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L60
            goto Lc
        L60:
            java.lang.String r0 = "video_live"
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29306Beo.LJJLIIIJLLLLLLLZ(java.lang.String):java.lang.String");
    }

    public static final String LJJLIL(Integer num) {
        if (num == null || !LJIIZILJ(num.intValue())) {
            return "portrait";
        }
        return "landscape";
    }

    public static final java.util.Map<String, String> LJJLJ(java.util.Map<String, ? extends Object> map) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (str = value.toString()) == null) {
                str = "";
            }
            linkedHashMap.put(key, str);
        }
        return linkedHashMap;
    }

    public static final void LJJLJLI(View view) {
        if (view != null && view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    public static final OSZ LJ(InterfaceC88472Yns isTarget, List list) {
        o.LJIIIZ(list, "<this>");
        o.LJIIIZ(isTarget, "isTarget");
        ListIterator listIterator = list.listIterator();
        list.iterator();
        int i = -1;
        while (listIterator.hasNext()) {
            i++;
            Object next = listIterator.next();
            if (((Boolean) isTarget.invoke(next)).booleanValue()) {
                return new OSZ(next, Integer.valueOf(i));
            }
        }
        return new OSZ(null, -1);
    }

    public static final Object LJJIIZ(C73428Sro c73428Sro, C3CS c3cs) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(c3cs));
        xks.LJIIL();
        xks.LJIILIIL(new AqS171S0100000_5((C73411SrX) c73428Sro.LJJJLIIL(new AfS53S0100000_1(xks, 68), new AfS53S0100000_1(xks, 69)), 663));
        return xks.LJIIJJI();
    }

    public static final <T> Object LJJIIZI(AbstractC73638SvC<T> abstractC73638SvC, InterfaceC67352kd<? super T> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        xks.LJIILIIL(new AqS167S0100000_1((C73495Sst) abstractC73638SvC.LJJII(new AfS53S0100000_1(xks, 70), new AfS53S0100000_1(xks, 71)), 337));
        return xks.LJIIJJI();
    }

    public static final void LJJIJIIJI(InterfaceC88472Yns predicate, List list) {
        o.LJIIIZ(list, "<this>");
        o.LJIIIZ(predicate, "predicate");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    public static final void LJJIJIL(Collection collection, InterfaceC88472Yns filter) {
        o.LJIIIZ(collection, "<this>");
        o.LJIIIZ(filter, "filter");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Boolean) filter.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    public static final void LJJJI(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        if (z) {
            LJJJ(interfaceC65784Pro);
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LJJJJJL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LJJJJL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJJJJLI(int i, View view) {
        if (view != null) {
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
    }

    public static final void LJJJJLL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.rightMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LJJJJZI(int i, C47061t0 c47061t0) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (c47061t0 != null) {
            ViewGroup.LayoutParams layoutParams = c47061t0.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.setMarginStart(i);
            }
            c47061t0.requestLayout();
        }
    }

    public static final void LJJJLIIL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.leftMargin = i;
            }
            view.requestLayout();
        }
    }

    public static void LJJJLZIJ(View view, View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        C16880lQ.LJIIJ(new ACListenerS23S0100100_5(500L, listener, 2), view);
    }

    public static final void LJJLI(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.rightMargin = i;
                marginLayoutParams.setMarginEnd(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJJLIIIIJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.rightMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LJJLIIIJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJJLIIIJILLIZJL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LJJLIIIJJI(View view, boolean z) {
        if (z) {
            LJJLJLI(view);
        } else {
            LJI(view);
        }
    }

    public static final boolean LJJLIIIJLJLI(Boolean bool, InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(action, "action");
        if (LJJIFFI(bool)) {
            action.invoke();
            return true;
        }
        return false;
    }

    public static final View LJIIIIZZ(int i, ViewGroup viewGroup, boolean z) {
        return C1DI.LIZ(viewGroup, "<this>", i, viewGroup, z, "from(context).inflate(la…tRes, this, attachToRoot)");
    }

    public static final android.net.Uri LJJIJL(android.net.Uri uri, String str, String newValue) {
        String queryParameter;
        o.LJIIIZ(newValue, "newValue");
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (o.LJ(str2, str)) {
                queryParameter = newValue;
            } else {
                queryParameter = UriProtector.getQueryParameter(uri, str2);
            }
            clearQuery.appendQueryParameter(str2, queryParameter);
        }
        android.net.Uri build = clearQuery.build();
        o.LJIIIIZZ(build, "newUri.build()");
        return build;
    }

    public static final void LJJJJZ(int i, int i2, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.setMarginEnd(i2);
            }
            view.requestLayout();
        }
    }

    public static final void LJJJLL(View view, long j, InterfaceC88472Yns<? super View, C76800UCe> listener) {
        o.LJIIIZ(view, "<this>");
        o.LJIIIZ(listener, "listener");
        C16880lQ.LJIIJ(new ACListenerS23S0100100_5(j, listener, 1), view);
    }

    public static final void LJJLIIIJJIZ(int i, int i2, View view) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            view.requestLayout();
        }
    }

    public static XKQ LJJIIJZLJL(LifecycleOwner lifecycleOwner, AbstractC78621UtN abstractC78621UtN, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        XKY start;
        MBA context = abstractC78621UtN;
        if ((i & 1) != 0) {
            context = MBB.INSTANCE;
        }
        if ((i & 2) != 0) {
            start = XKY.DEFAULT;
        } else {
            start = null;
        }
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(start, "start");
        return XKX.LIZJ(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), context, start, interfaceC88471Ynr);
    }

    public static final void LJJL(View view, int i, long j, InterfaceC88472Yns<? super View, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        C16880lQ.LJIIJ(new ViewOnClickListenerC25758A9a(i, j, listener), view);
    }
}
