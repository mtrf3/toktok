package com.bytedance.vmsdk.jsbridge;

import X.C16880lQ;
import X.C37710Er4;
import X.InterfaceC37580Eoy;
import X.InterfaceC37709Er3;
import X.InterfaceC37711Er5;
import X.X1D;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.ReadableArray;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.WritableArray;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* loaded from: classes7.dex */
public class JSModuleWrapper {
    public final JSModule LIZ;
    public final ArrayList<MethodDescriptor> LIZIZ = new ArrayList<>();
    public final ArrayList<AttributeDescriptor> LIZJ = new ArrayList<>();
    public final String LIZLLL;

    public final void LIZ() {
        HashSet hashSet = new HashSet();
        for (Field field : this.LIZ.getClass().getDeclaredFields()) {
            if (field.getAnnotation(InterfaceC37711Er5.class) != null) {
                String name = field.getName();
                if (!hashSet.contains(name)) {
                    hashSet.add(name);
                    AttributeDescriptor attributeDescriptor = new AttributeDescriptor();
                    attributeDescriptor.LIZ = name;
                    JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                    attributeDescriptor.LIZIZ = javaOnlyArray;
                    try {
                        javaOnlyArray.add(field.get(this.LIZ));
                    } catch (IllegalAccessException unused) {
                    }
                    this.LIZJ.add(attributeDescriptor);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Java Module ");
                    LIZ.append(getName());
                    LIZ.append(" attribute name already registered: ");
                    LIZ.append(name);
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                }
            }
        }
    }

    public final void LIZIZ() {
        HashSet hashSet = new HashSet();
        for (Method method : this.LIZ.getClass().getDeclaredMethods()) {
            if (method.getAnnotation(InterfaceC37580Eoy.class) != null) {
                String name = method.getName();
                if (!hashSet.contains(name)) {
                    hashSet.add(name);
                    MethodDescriptor methodDescriptor = new MethodDescriptor();
                    C37710Er4 c37710Er4 = new C37710Er4(method);
                    methodDescriptor.LIZJ = name;
                    if (!c37710Er4.LIZIZ) {
                        c37710Er4.LIZIZ = true;
                        Class[] clsArr = c37710Er4.LIZ;
                        StringBuilder sb = new StringBuilder(clsArr.length + 2);
                        Class<?> returnType = method.getReturnType();
                        char LIZ = C37710Er4.LIZ(returnType);
                        if (LIZ == 0) {
                            if (returnType == Void.TYPE) {
                                LIZ = 'v';
                            } else if (returnType == WritableMap.class) {
                                LIZ = 'M';
                            } else if (returnType == WritableArray.class) {
                                LIZ = 'A';
                            } else if (returnType == byte[].class) {
                                LIZ = 'a';
                            } else {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("Got unknown return class: ");
                                LIZ2.append(C16880lQ.LJLLJ(returnType));
                                throw new RuntimeException(X1D.LIZIZ(LIZ2));
                            }
                        }
                        sb.append(LIZ);
                        sb.append('.');
                        for (int i = 0; i < clsArr.length; i++) {
                            Class cls = clsArr[i];
                            if (cls != Promise.class || i == clsArr.length - 1) {
                                char LIZ3 = C37710Er4.LIZ(cls);
                                if (LIZ3 == 0) {
                                    if (cls == Callback.class) {
                                        LIZ3 = 'X';
                                    } else if (cls == Promise.class) {
                                        LIZ3 = 'P';
                                    } else if (cls == ReadableMap.class) {
                                        LIZ3 = 'M';
                                    } else if (cls == ReadableArray.class) {
                                        LIZ3 = 'A';
                                    } else if (cls == InterfaceC37709Er3.class) {
                                        LIZ3 = 'Y';
                                    } else if (cls == byte[].class) {
                                        LIZ3 = 'a';
                                    } else {
                                        StringBuilder LIZ4 = X1D.LIZ();
                                        LIZ4.append("Got unknown param class: ");
                                        LIZ4.append(C16880lQ.LJLLJ(cls));
                                        throw new RuntimeException(X1D.LIZIZ(LIZ4));
                                    }
                                }
                                sb.append(LIZ3);
                            } else {
                                throw new AssertionError("Promise must be used as last parameter only");
                            }
                        }
                        c37710Er4.LIZJ = sb.toString();
                    }
                    String str = c37710Er4.LIZJ;
                    if (str != null) {
                        methodDescriptor.LIZIZ = str;
                        methodDescriptor.LIZ = method;
                        this.LIZIZ.add(methodDescriptor);
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("Java Module ");
                    LIZ5.append(getName());
                    LIZ5.append(" method name already registered: ");
                    LIZ5.append(name);
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ5));
                }
            }
        }
    }

    public Collection<AttributeDescriptor> getAttributeDescriptor() {
        if (this.LIZJ.isEmpty()) {
            try {
                LIZ();
            } catch (RuntimeException unused) {
            }
        }
        return this.LIZJ;
    }

    public Collection<MethodDescriptor> getMethodDescriptors() {
        if (this.LIZIZ.isEmpty()) {
            try {
                LIZIZ();
            } catch (RuntimeException unused) {
            }
        }
        return this.LIZIZ;
    }

    public JSModule getModule() {
        return this.LIZ;
    }

    public String getName() {
        return this.LIZLLL;
    }

    public JSModuleWrapper(String str, JSModule jSModule) {
        this.LIZLLL = str;
        this.LIZ = jSModule;
    }
}
