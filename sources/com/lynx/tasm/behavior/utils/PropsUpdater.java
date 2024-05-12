package com.lynx.tasm.behavior.utils;

import X.AbstractC79677VOv;
import X.C25620zW;
import X.C61328O5c;
import X.VP4;
import X.VPA;
import X.X1D;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import defpackage.i0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes15.dex */
public final class PropsUpdater {
    public static final Map<Class<?>, LynxUISetter<?>> LIZ = new ConcurrentHashMap();
    public static final Map<Class<?>, ShadowNodeSetter<?>> LIZIZ = new ConcurrentHashMap();
    public static final Map<String, Settable> LIZJ = new HashMap();

    /* loaded from: classes15.dex */
    public static class FallbackLynxUISetter<T extends LynxBaseUI> implements LynxUISetter<T> {
        public final Map<String, AbstractC79677VOv> LIZ;

        public FallbackLynxUISetter() {
            throw null;
        }

        public FallbackLynxUISetter(Class cls) {
            this.LIZ = VP4.LIZJ(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.LynxUISetter
        public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
            AbstractC79677VOv abstractC79677VOv = this.LIZ.get(str);
            if (abstractC79677VOv != null) {
                try {
                    Integer num = abstractC79677VOv.LIZJ;
                    if (num == null) {
                        AbstractC79677VOv.LIZ(lynxBaseUI, abstractC79677VOv.LIZIZ, new Object[]{abstractC79677VOv.LIZIZ(vpa)});
                    } else {
                        AbstractC79677VOv.LIZ(lynxBaseUI, abstractC79677VOv.LIZIZ, new Object[]{num, abstractC79677VOv.LIZIZ(vpa)});
                    }
                } catch (Throwable th) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Error while updating property '");
                    LIZ.append(abstractC79677VOv.LIZ);
                    LIZ.append("' in shadow node of type: ");
                    LIZ.append(lynxBaseUI.getClass());
                    LIZ.append(":");
                    LIZ.append(th.getMessage());
                    throw new RuntimeException(X1D.LIZIZ(LIZ), th);
                }
            }
        }
    }

    /* loaded from: classes15.dex */
    public static class FallbackShadowNodeSetter<T extends ShadowNode> implements ShadowNodeSetter<T> {
        public final Map<String, AbstractC79677VOv> LIZ;

        public FallbackShadowNodeSetter() {
            throw null;
        }

        public FallbackShadowNodeSetter(Class cls) {
            this.LIZ = VP4.LIZLLL(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.ShadowNodeSetter
        public final void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
            AbstractC79677VOv abstractC79677VOv = this.LIZ.get(str);
            if (abstractC79677VOv != null) {
                try {
                    Integer num = abstractC79677VOv.LIZJ;
                    if (num == null) {
                        AbstractC79677VOv.LIZ(shadowNode, abstractC79677VOv.LIZIZ, new Object[]{abstractC79677VOv.LIZIZ(vpa)});
                    } else {
                        AbstractC79677VOv.LIZ(shadowNode, abstractC79677VOv.LIZIZ, new Object[]{num, abstractC79677VOv.LIZIZ(vpa)});
                    }
                } catch (Throwable th) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Error while updating property '");
                    LIZ.append(abstractC79677VOv.LIZ);
                    LIZ.append("' in shadow node of type: ");
                    String str2 = shadowNode.LJIIIZ;
                    if (str2 != null) {
                        throw new RuntimeException(C61328O5c.LIZLLL(LIZ, str2, ":", th, LIZ), th);
                    }
                    throw new AssertionError();
                }
            }
        }
    }

    public static <T> T LIZ(Class<?> cls) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(cls.getName());
        LIZ2.append("$$PropsSetter");
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        T t = (T) ((HashMap) LIZJ).get(LIZIZ2);
        if (t != null) {
            return t;
        }
        try {
            return (T) Class.forName(LIZIZ2).newInstance();
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException(i0.LJFF("Unable to instantiate methods getter for ", LIZIZ2), e);
        } catch (InstantiationException e2) {
            e = e2;
            throw new RuntimeException(i0.LJFF("Unable to instantiate methods getter for ", LIZIZ2), e);
        }
    }

    public static <T extends ShadowNode> void LIZIZ(T t, VPA vpa) {
        Class<?> cls = t.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        ShadowNodeSetter shadowNodeSetter = (ShadowNodeSetter) concurrentHashMap.get(cls);
        if (shadowNodeSetter == null) {
            shadowNodeSetter = (ShadowNodeSetter) LIZ(cls);
            if (shadowNodeSetter == null) {
                shadowNodeSetter = new FallbackShadowNodeSetter(cls);
            }
            concurrentHashMap.put(cls, shadowNodeSetter);
        }
        ReadableMapKeySetIterator keySetIterator = vpa.LIZ.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            shadowNodeSetter.LIZIZ(t, keySetIterator.nextKey(), vpa);
        }
    }

    public static void LIZJ(VPA vpa, LynxBaseUI lynxBaseUI) {
        Class<?> cls = lynxBaseUI.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        LynxUISetter lynxUISetter = (LynxUISetter) concurrentHashMap.get(cls);
        if (lynxUISetter == null) {
            lynxUISetter = (LynxUISetter) LIZ(cls);
            if (lynxUISetter == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("PropsSetter not generated for class: ");
                LIZ2.append(cls.getName());
                LIZ2.append(". You should add module lynxProcessor");
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                if (!LynxEnv.LJIIIZ().LJIJJLI || !LynxEnv.LJIIIZ().LJIIJJI()) {
                    LLog.LIZLLL(4, "PropsUpdater", LIZIZ2);
                    lynxUISetter = new FallbackLynxUISetter(cls);
                } else {
                    throw new IllegalStateException(LIZIZ2);
                }
            }
            concurrentHashMap.put(cls, lynxUISetter);
        }
        ReadableMapKeySetIterator keySetIterator = vpa.LIZ.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                lynxUISetter.LIZ(lynxBaseUI, nextKey, vpa);
            } catch (Throwable th) {
                StringBuilder LIZIZ3 = C25620zW.LIZIZ("Error while updating property '", nextKey, "' in ui ");
                LIZIZ3.append(lynxBaseUI.getTagName());
                LIZIZ3.append(": ");
                LIZIZ3.append(th.getMessage());
                RuntimeException runtimeException = new RuntimeException(X1D.LIZIZ(LIZIZ3), th);
                runtimeException.setStackTrace(th.getStackTrace());
                lynxBaseUI.mContext.LJII(runtimeException, 1301, lynxBaseUI.getPlatformCustomInfo());
            }
        }
    }
}
