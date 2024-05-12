package X;

import android.view.View;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0N9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0N9 {
    public static final java.util.Map<InterfaceC65350Pko<? extends PreviewWidget>, PreviewWidget> LIZ = new HashMap();
    public static WidgetManager LIZIZ;
    public static DataChannel LIZJ;

    public static PreviewWidget LIZIZ(InterfaceC65350Pko interfaceC65350Pko) {
        o.LJIIIZ(interfaceC65350Pko, "<this>");
        Object obj = ((HashMap) LIZ).get(interfaceC65350Pko);
        if (obj instanceof PreviewWidget) {
            return (PreviewWidget) obj;
        }
        return null;
    }

    public static PreviewWidget LIZ(InterfaceC65350Pko interfaceC65350Pko, C31809Ce5 c31809Ce5, InterfaceC65350Pko[] interfaceC65350PkoArr, boolean z) {
        Object obj;
        View view;
        boolean z2;
        o.LJIIIZ(interfaceC65350Pko, "<this>");
        C0NA.LIZLLL.put(interfaceC65350Pko, ORY.LJLIIL(interfaceC65350PkoArr));
        PreviewWidget LIZIZ2 = LIZIZ(interfaceC65350Pko);
        if (LIZIZ2 != null && (view = LIZIZ2.getView()) != null) {
            if (C29306Beo.LJJIFFI((Boolean) ((LinkedHashMap) C0NA.LJ).get(interfaceC65350Pko)) && C0NA.LIZ(interfaceC65350Pko)) {
                z2 = true;
            } else {
                z2 = false;
            }
            C29306Beo.LJJLIIIJJI(view, z2);
        }
        PreviewWidget LIZIZ3 = LIZIZ(interfaceC65350Pko);
        if (LIZIZ3 == null) {
            LIZIZ3 = (PreviewWidget) C39557Ffl.LIZ(interfaceC65350Pko).newInstance();
            java.util.Map<InterfaceC65350Pko<? extends PreviewWidget>, PreviewWidget> map = LIZ;
            o.LJII(LIZIZ3, "null cannot be cast to non-null type T of com.bytedance.android.live.broadcast.preview.PreviewWidgetManager.<set-widget>");
            ((HashMap) map).put(interfaceC65350Pko, LIZIZ3);
        }
        View view2 = LIZIZ3.contentView;
        if (view2 == null) {
            WidgetManager widgetManager = LIZIZ;
            if (widgetManager != null) {
                DataChannel dataChannel = LIZJ;
                if (dataChannel != null) {
                    obj = dataChannel.kv0(BCX.class);
                } else {
                    obj = null;
                }
                widgetManager.loadPreviewWidget(c31809Ce5, LIZIZ3, z, obj, new InterfaceC31796Cds() { // from class: X.1Hl
                    @Override // X.InterfaceC31796Cds
                    public final boolean LIZ(Object obj2) {
                        Object obj3;
                        DataChannel dataChannel2 = C0N9.LIZJ;
                        if (dataChannel2 != null) {
                            obj3 = dataChannel2.kv0(BCX.class);
                        } else {
                            obj3 = null;
                        }
                        if (obj2 == obj3) {
                            return true;
                        }
                        return false;
                    }
                });
            }
        } else {
            LIZIZ3.widgetContainer = c31809Ce5;
            if (c31809Ce5 != null) {
                c31809Ce5.LIZIZ(view2);
            }
            LIZIZ3.LJZ();
        }
        return LIZIZ3;
    }
}
