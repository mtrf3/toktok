package X;

import android.content.Context;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Nsb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60737Nsb {
    public HashMap<String, Object> autoHideLoadingEventExtraInfo;
    public String bid;
    public String bidFrom;
    public String containerId;
    public int containerType;
    public boolean enableAutoHideLoadingScript;
    public L96 eventCachePool;
    public Integer fmpValueForAutoHideLoadingScript;
    public InterfaceC60710NsA hybridParams;
    public String initData;
    public boolean jsbOptimize;
    public boolean jsbOptimizeV2;
    public final InterfaceC88472Yns<Context, InterfaceC60831Nu7> performanceViewInvoke;
    public String resourcePath;
    public volatile boolean resourcePreloadTriggered;
    public C38518F9u runtimeInfo;
    public InterfaceC88473Ynt<? super InterfaceC60761Nsz, ? super String, Object, C76800UCe> sendEventListener;
    public java.util.Set<String> subBids;
    public JSONObject templateResData;
    public String url;
    public boolean usePreload;
    public String vaid;
    public static final C60739Nsd Companion = new C60739Nsd();
    public static final int CONTAINER_TYPE_SPARK = 1;

    public final InterfaceC60761Nsz LJI() {
        C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
        String str = this.containerId;
        c31999Ch9.getClass();
        return C31999Ch9.LIZIZ(str);
    }

    public final void LJIIL() {
        L96 l96;
        InterfaceC60761Nsz LJI;
        HybridSchemaParam LIZLLL;
        InterfaceC60710NsA interfaceC60710NsA = this.hybridParams;
        if ((interfaceC60710NsA == null || (LIZLLL = interfaceC60710NsA.LIZLLL()) == null || !LIZLLL.getDisableEventCache()) && (l96 = this.eventCachePool) != null) {
            Iterator<OSZ<String, Object>> it = l96.LIZ.iterator();
            while (it.hasNext()) {
                OSZ<String, Object> next = it.next();
                String first = next.getFirst();
                Object second = next.getSecond();
                if (second == null) {
                    InterfaceC60761Nsz LJI2 = LJI();
                    if (LJI2 != null) {
                        LJI2.LJIIJ(first, null);
                    }
                } else if (second instanceof List) {
                    InterfaceC60761Nsz LJI3 = LJI();
                    if (LJI3 != null) {
                        LJI3.LJIIJ(first, (List) second);
                    }
                } else if (second instanceof JSONObject) {
                    InterfaceC60761Nsz LJI4 = LJI();
                    if (LJI4 != null) {
                        LJI4.LJIIIZ(first, (JSONObject) second);
                    }
                } else if ((second instanceof java.util.Map) && (LJI = LJI()) != null) {
                    LJI.LJ(first, (java.util.Map) second);
                }
            }
            l96.LIZ.clear();
        }
    }

    public final int hashCode() {
        return this.containerId.hashCode();
    }

    public C60737Nsb() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(String.valueOf(System.currentTimeMillis()));
        LIZ.append("-");
        LIZ.append(UUID.randomUUID().toString());
        this.containerId = X1D.LIZIZ(LIZ);
        this.containerType = 0;
        this.performanceViewInvoke = C60738Nsc.LJLIL;
        this.bid = "hybridkit_default_bid";
        this.vaid = "";
        this.runtimeInfo = new C38518F9u();
        this.templateResData = new JSONObject();
        this.bidFrom = "hybridkit_default_bid";
        this.resourcePath = "";
        this.autoHideLoadingEventExtraInfo = new HashMap<>();
        this.url = "";
        this.subBids = Collections.synchronizedSet(new LinkedHashSet());
    }

    public InterfaceC88472Yns<Context, InterfaceC60831Nu7> LIZLLL() {
        return this.performanceViewInvoke;
    }

    public final void LIZ(String str) {
        if (str != null) {
            this.subBids.add(str);
        }
    }

    public final <T> T LIZIZ(Class<T> cls) {
        C39836FkG.LJII.getClass();
        C39836FkG LIZ = C38262Ezy.LIZ();
        String containerId = this.containerId;
        LIZ.getClass();
        o.LJIIJ(containerId, "containerId");
        InterfaceC39861Fkf interfaceC39861Fkf = LIZ.LIZJ.get(containerId);
        if (interfaceC39861Fkf != null) {
            return (T) interfaceC39861Fkf.LIZ(cls);
        }
        return null;
    }

    public EnumC60795NtX LJ(Context context) {
        HybridSchemaParam LIZLLL;
        String forceThemeStyle;
        EnumC60795NtX enumC60795NtX;
        InterfaceC60710NsA interfaceC60710NsA = this.hybridParams;
        if (interfaceC60710NsA != null && (LIZLLL = interfaceC60710NsA.LIZLLL()) != null && (forceThemeStyle = LIZLLL.getForceThemeStyle()) != null) {
            if (ujb.o.LJJJJIZL(forceThemeStyle, "dark", true)) {
                enumC60795NtX = EnumC60795NtX.DARK;
            } else if (ujb.o.LJJJJIZL(forceThemeStyle, "light", true)) {
                enumC60795NtX = EnumC60795NtX.LIGHT;
            }
            if (enumC60795NtX != null) {
                return enumC60795NtX;
            }
        }
        return EnumC60795NtX.LIGHT;
    }

    public final void LJIIIIZZ(String str) {
        if (str != null) {
            this.subBids.remove(str);
        }
    }

    public final <T> void LJIIIZ(Class<T> cls) {
        C39836FkG.LJII.getClass();
        C39836FkG LIZ = C38262Ezy.LIZ();
        String containerId = this.containerId;
        LIZ.getClass();
        o.LJIIJ(containerId, "containerId");
        InterfaceC39861Fkf interfaceC39861Fkf = LIZ.LIZJ.get(containerId);
        if (interfaceC39861Fkf != null) {
            interfaceC39861Fkf.LIZIZ(cls);
        }
    }

    public final void LJIILIIL(long j) {
        JSONObject jSONObject = this.templateResData;
        if (jSONObject.length() == 0) {
            jSONObject.put("container_init_cost", j);
        } else {
            if ((jSONObject.length() != 1 || jSONObject.optLong("container_init_cost") != 0) && jSONObject.length() <= 1) {
                return;
            }
            this.templateResData = Q7K.LIZLLL("container_init_cost", j);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C60737Nsb) {
            return o.LJ(((C60737Nsb) obj).containerId, this.containerId);
        }
        return false;
    }

    public final <T> void LJII(Class<T> cls, T t) {
        C39836FkG.LJII.getClass();
        C39836FkG LIZ = C38262Ezy.LIZ();
        String containerId = this.containerId;
        LIZ.getClass();
        o.LJIIJ(containerId, "containerId");
        if (LIZ.LIZJ.get(containerId) == null) {
            LIZ.LIZJ.put(containerId, new M2H());
        }
        InterfaceC39861Fkf interfaceC39861Fkf = LIZ.LIZJ.get(containerId);
        if (interfaceC39861Fkf != null) {
            interfaceC39861Fkf.LIZJ(cls, t);
        }
    }

    public final void LJIIJ(Class cls, AbstractC60811Ntn abstractC60811Ntn) {
        C39836FkG.LJII.getClass();
        C39836FkG LIZ = C38262Ezy.LIZ();
        String containerId = this.containerId;
        LIZ.getClass();
        o.LJIIJ(containerId, "containerId");
        InterfaceC39861Fkf interfaceC39861Fkf = LIZ.LIZJ.get(containerId);
        if (interfaceC39861Fkf != null) {
            Object LIZ2 = interfaceC39861Fkf.LIZ(cls);
            if (LIZ2 instanceof M2I) {
                Object obj = null;
                if (o.LJ(LIZ2, abstractC60811Ntn)) {
                    interfaceC39861Fkf.LIZIZ(cls);
                    Object next = ((M2I) LIZ2).next();
                    if (next instanceof Object) {
                        obj = next;
                    }
                    interfaceC39861Fkf.LIZJ(cls, obj);
                    return;
                }
                M2I m2i = (M2I) LIZ2;
                Object next2 = ((M2I) LIZ2).next();
                if (!(next2 instanceof M2I)) {
                    next2 = null;
                }
                while (true) {
                    M2I m2i2 = (M2I) next2;
                    M2I m2i3 = m2i;
                    m2i = m2i2;
                    if (m2i2 == null) {
                        return;
                    }
                    if (o.LJ(m2i2, abstractC60811Ntn)) {
                        if (m2i3 == null) {
                            return;
                        }
                        Object next3 = m2i2.next();
                        if (next3 instanceof Object) {
                            obj = next3;
                        }
                        m2i3.LJIILIIL(obj);
                        return;
                    }
                    next2 = m2i2.next();
                    if (!(next2 instanceof M2I)) {
                        next2 = null;
                    }
                }
            } else {
                interfaceC39861Fkf.LIZIZ(cls);
            }
        }
    }

    public final void LJIIJJI(Object obj, String str) {
        HybridSchemaParam LIZLLL;
        InterfaceC60761Nsz LJI = LJI();
        if (LJI != null && LJI.LJFF()) {
            if (obj == null) {
                LJI.LJIIJ(str, null);
                return;
            }
            if (obj instanceof List) {
                LJI.LJIIJ(str, (List) obj);
                return;
            } else if (obj instanceof JSONObject) {
                LJI.LJIIIZ(str, (JSONObject) obj);
                return;
            } else {
                if (!(obj instanceof java.util.Map)) {
                    return;
                }
                LJI.LJ(str, (java.util.Map) obj);
                return;
            }
        }
        InterfaceC60710NsA interfaceC60710NsA = this.hybridParams;
        if (interfaceC60710NsA == null || (LIZLLL = interfaceC60710NsA.LIZLLL()) == null || !LIZLLL.getDisableEventCache()) {
            L96 l96 = this.eventCachePool;
            if (l96 == null) {
                synchronized (this) {
                    l96 = this.eventCachePool;
                    if (l96 == null) {
                        l96 = new L96();
                        this.eventCachePool = l96;
                    }
                }
            }
            l96.LIZ.add(new OSZ<>(str, obj));
        }
    }
}
