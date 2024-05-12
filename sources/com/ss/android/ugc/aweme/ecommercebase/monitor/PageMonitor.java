package com.ss.android.ugc.aweme.ecommercebase.monitor;

import X.C1A8;
import X.C221108m2;
import X.C36665EaD;
import X.C36668EaG;
import X.C38572FBw;
import X.C38574FBy;
import X.C38770FJm;
import X.C76542zS;
import X.C78897Uxp;
import X.C78983UzD;
import X.InterfaceC27438Apm;
import X.InterfaceC37828Esy;
import X.InterfaceC64592gB;
import X.ORZ;
import X.OSZ;
import android.app.Activity;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PageMonitor {
    public static final PageMonitor LIZ = new PageMonitor();
    public static final HashMap<InterfaceC37828Esy, Lifecycle.Event> LIZIZ = new HashMap<>();
    public static final HashMap<LifecycleOwner, InterfaceC37828Esy> LIZJ = new HashMap<>();
    public static final HashMap<InterfaceC37828Esy, C38574FBy> LIZLLL = new HashMap<>();
    public static final WeakHashMap<String, OSZ<Map<String, String>, Map<String, String>>> LJ = new WeakHashMap<>();
    public static final LinkedList<InterfaceC37828Esy> LJFF = new LinkedList<>();
    public static final C36668EaG LJI = C36668EaG.LJLIL;
    public static InterfaceC64592gB<? super Throwable> LJII;
    public static C38572FBw LJIIIIZZ;
    public static final LifecycleObserver LJIIIZ;

    static {
        C221108m2.LIZIZ(C36665EaD.LJLIL);
        LJIIIZ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor$observer$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                C38574FBy c38574FBy;
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                synchronized (PageMonitor.LIZ) {
                    InterfaceC37828Esy interfaceC37828Esy = PageMonitor.LIZJ.get(source);
                    if (interfaceC37828Esy == 0) {
                        return;
                    }
                    String pageName = interfaceC37828Esy.getPageName();
                    HashMap<InterfaceC37828Esy, Lifecycle.Event> hashMap = PageMonitor.LIZIZ;
                    hashMap.put(interfaceC37828Esy, event);
                    int i = C38770FJm.LIZ[event.ordinal()];
                    Object obj = null;
                    if (i == 1) {
                        if (!o.LJ(pageName, "debug_panel")) {
                            LinkedList<InterfaceC37828Esy> linkedList = PageMonitor.LJFF;
                            InterfaceC37828Esy interfaceC37828Esy2 = (InterfaceC37828Esy) ORZ.LJLLLL(linkedList);
                            if (interfaceC37828Esy2 != 0) {
                                obj = interfaceC37828Esy2.getPageName();
                            }
                            if (o.LJ(obj, interfaceC37828Esy.getPageName())) {
                                if (o.LJ(interfaceC37828Esy2, interfaceC37828Esy)) {
                                    PageMonitor.LIZLLL.remove(interfaceC37828Esy2);
                                    linkedList.remove(interfaceC37828Esy2);
                                } else if ((interfaceC37828Esy instanceof Fragment) && o.LJ(((Fragment) interfaceC37828Esy).mo49getActivity(), interfaceC37828Esy2)) {
                                    PageMonitor.LIZLLL.remove(interfaceC37828Esy2);
                                    linkedList.remove(interfaceC37828Esy2);
                                } else if ((interfaceC37828Esy instanceof Activity) && (interfaceC37828Esy2 instanceof Fragment) && ((Fragment) interfaceC37828Esy2).mo49getActivity() == interfaceC37828Esy) {
                                    return;
                                }
                            }
                            if (linkedList.contains(interfaceC37828Esy)) {
                                PageMonitor.LIZLLL.remove(interfaceC37828Esy);
                                linkedList.remove(interfaceC37828Esy);
                            }
                            HashMap<InterfaceC37828Esy, C38574FBy> hashMap2 = PageMonitor.LIZLLL;
                            if (hashMap2.get(interfaceC37828Esy) == null) {
                                hashMap2.put(interfaceC37828Esy, new C38574FBy(interfaceC37828Esy.getPageName()));
                            }
                            C38574FBy c38574FBy2 = hashMap2.get(interfaceC37828Esy);
                            if (c38574FBy2 != null) {
                                c38574FBy2.LIZIZ = SystemClock.elapsedRealtime();
                            }
                            linkedList.addFirst(interfaceC37828Esy);
                            OSZ<Map<String, String>, Map<String, String>> osz = PageMonitor.LJ.get(pageName);
                            if (osz != null) {
                                PageMonitor.LIZLLL(pageName, osz.getFirst(), osz.getSecond());
                            }
                        }
                    } else if (i != 2) {
                        if (i == 3 && !o.LJ(pageName, "debug_panel")) {
                            LinkedList<InterfaceC37828Esy> linkedList2 = PageMonitor.LJFF;
                            linkedList2.remove(interfaceC37828Esy);
                            hashMap.remove(interfaceC37828Esy);
                            Iterator<InterfaceC37828Esy> it = linkedList2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                InterfaceC37828Esy next = it.next();
                                if (o.LJ(next.getPageName(), pageName)) {
                                    obj = next;
                                    break;
                                }
                            }
                            if (((InterfaceC37828Esy) obj) == null) {
                                PageMonitor.LJ.remove(pageName);
                            }
                            PageMonitor.LIZ.LIZIZ(source);
                            PageMonitor.LIZJ.isEmpty();
                        }
                    } else if ((interfaceC37828Esy instanceof InterfaceC27438Apm) && (c38574FBy = PageMonitor.LIZLLL.get(interfaceC37828Esy)) != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j = c38574FBy.LIZIZ;
                        long j2 = elapsedRealtime - j;
                        if (j > 0 && j2 > 1000) {
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("page_name", c38574FBy.LIZ);
                            for (Map.Entry<String, String> entry : c38574FBy.LIZJ.entrySet()) {
                                if (!o.LJ(entry.getKey(), "response") && !o.LJ(entry.getKey(), "requestParams")) {
                                    hashMap3.put(entry.getKey(), entry.getValue());
                                }
                            }
                            hashMap3.put("stay_time", String.valueOf(j2));
                            if (((InterfaceC27438Apm) interfaceC37828Esy).onDetectBlank(hashMap3)) {
                                for (Map.Entry entry2 : hashMap3.entrySet()) {
                                }
                                hashMap3.put("is_blank", "1");
                                String str = (String) C1A8.LJIIZILJ(interfaceC37828Esy, "schema");
                                if (str != null) {
                                    hashMap3.put("schema", str);
                                }
                                C78983UzD.LJIILLIIL("EcomPageMonitor: " + c38574FBy.LIZ + " is blank", hashMap3);
                            } else {
                                hashMap3.put("is_blank", CardStruct.IStatusCode.DEFAULT);
                            }
                            hashMap3.remove("schema");
                            C76542zS.LIZ("blank_monitor", hashMap3);
                        }
                    }
                }
            }
        };
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:8:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    public final void LIZIZ(androidx.lifecycle.LifecycleOwner r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.HashMap<androidx.lifecycle.LifecycleOwner, X.Esy> r2 = com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor.LIZJ     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r2.remove(r4)     // Catch: java.lang.Throwable -> L4f
            X.Esy r1 = (X.InterfaceC37828Esy) r1     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L13
            java.util.HashMap<X.Esy, X.FBy> r0 = com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor.LIZLLL     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L4f
            X.FBy r0 = (X.C38574FBy) r0     // Catch: java.lang.Throwable -> L4f
        L13:
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L4d
        L1a:
            X.2gB<? super java.lang.Throwable> r0 = com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor.LJII     // Catch: java.lang.Throwable -> L1f
            X.C73548Stk.LIZ = r0     // Catch: java.lang.Throwable -> L1f
            goto L29
        L1f:
            r2 = move-exception
            Y.ACallableS104S0100000_1 r1 = new Y.ACallableS104S0100000_1     // Catch: java.lang.Throwable -> L4f
            r0 = 2
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L4f
            X.C10K.LIZJ(r1)     // Catch: java.lang.Throwable -> L4f
        L29:
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L4f
            r0.getClass()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "ecom_blank_detect_enable"
            r0 = 0
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L48
            X.FBw r1 = com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor.LJIIIIZZ     // Catch: java.lang.Throwable -> L4f
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.JAVA     // Catch: java.lang.Throwable -> L4f
            com.bytedance.crash.Npth.removeAttachUserData(r1, r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "is_ecom"
            com.bytedance.crash.Npth.removeTag(r0)     // Catch: java.lang.Throwable -> L4f
            r0 = 0
            com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor.LJIIIIZZ = r0     // Catch: java.lang.Throwable -> L4f
        L48:
            X.Aln r0 = X.C27191Aln.LIZ     // Catch: java.lang.Throwable -> L4f
            r0.LIZ()     // Catch: java.lang.Throwable -> L4f
        L4d:
            monitor-exit(r3)
            return
        L4f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor.LIZIZ(androidx.lifecycle.LifecycleOwner):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:9:0x0028
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    public final void LIZ(androidx.lifecycle.LifecycleOwner r4, X.InterfaceC37828Esy r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.HashMap<androidx.lifecycle.LifecycleOwner, X.Esy> r2 = com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor.LIZJ     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r2.get(r4)     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L5d
            java.lang.String r1 = r5.getPageName()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "debug_panel"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L5d
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()     // Catch: java.lang.Throwable -> L5f
            androidx.lifecycle.LifecycleObserver r0 = com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor.LJIIIZ     // Catch: java.lang.Throwable -> L5f
            r1.addObserver(r0)     // Catch: java.lang.Throwable -> L5f
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L5f
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L5f
            r0 = 1
            if (r1 != r0) goto L5d
        L29:
            X.2gB<? super java.lang.Throwable> r0 = X.C73548Stk.LIZ     // Catch: java.lang.Throwable -> L3a
            X.EaG r1 = com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor.LJI     // Catch: java.lang.Throwable -> L3a
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L44
            X.2gB<? super java.lang.Throwable> r0 = X.C73548Stk.LIZ     // Catch: java.lang.Throwable -> L3a
            com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor.LJII = r0     // Catch: java.lang.Throwable -> L3a
            X.C73548Stk.LIZ = r1     // Catch: java.lang.Throwable -> L3a
            goto L44
        L3a:
            r2 = move-exception
            Y.ACallableS104S0100000_1 r1 = new Y.ACallableS104S0100000_1     // Catch: java.lang.Throwable -> L5f
            r0 = 1
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L5f
            X.C10K.LIZJ(r1)     // Catch: java.lang.Throwable -> L5f
        L44:
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L5f
            r0.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = "ecom_blank_detect_enable"
            r0 = 0
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L5d
            X.FBw r0 = X.C38572FBw.LIZ     // Catch: java.lang.Throwable -> L5f
            com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor.LJIIIIZZ = r0     // Catch: java.lang.Throwable -> L5f
            X.FBx r0 = X.RunnableC38573FBx.LJLIL     // Catch: java.lang.Throwable -> L5f
            X.RunnableC39007FSp.LIZIZ(r0)     // Catch: java.lang.Throwable -> L5f
        L5d:
            monitor-exit(r3)
            return
        L5f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor.LIZ(androidx.lifecycle.LifecycleOwner, X.Esy):void");
    }

    public static boolean LIZLLL(String str, Map map, Map map2) {
        HashMap<String, String> hashMap;
        Iterator<InterfaceC37828Esy> it = LJFF.iterator();
        while (it.hasNext()) {
            InterfaceC37828Esy next = it.next();
            if (o.LJ(next.getPageName(), str)) {
                LaneParams LJIJJ = C78897Uxp.LJIJJ(next);
                for (Map.Entry entry : map2.entrySet()) {
                    if (!o.LJ(LJIJJ.get(entry.getKey()), entry.getValue())) {
                        break;
                    }
                }
                C38574FBy c38574FBy = LIZLLL.get(next);
                if (c38574FBy != null && (hashMap = c38574FBy.LIZJ) != null) {
                    hashMap.putAll(map);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public final void LIZJ(Map map, Map map2, List list) {
        synchronized (this) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!LIZLLL(str, map, map2)) {
                    LJ.put(str, new OSZ<>(map, map2));
                }
            }
        }
    }
}
