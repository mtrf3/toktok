package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.AbstractC65781Prl;
import X.C82173Kj;
import X.InterfaceC106314Ff;
import X.InterfaceC65784Pro;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMServiceProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMServiceProvider$performanceService$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C82173Kj> {
    public static final IMServiceProvider$performanceService$2 INSTANCE = new IMServiceProvider$performanceService$2();

    public IMServiceProvider$performanceService$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.3Kj] */
    @Override // X.InterfaceC65784Pro
    public final C82173Kj invoke() {
        return new InterfaceC106314Ff() { // from class: X.3Kj
            @Override // X.InterfaceC106314Ff
            public final String LIZLLL() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                if (!C19N.LJ("tt_im_user_debug_snapshot", false)) {
                    return "";
                }
                java.util.Map LJJLIL = C113554cx.LJJLIL(C96413qP.LIZ.LJIILLIIL().LIZ());
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("{imsdk_init_state:");
                LIZ.append(C82873Nb.LIZLLL.getValue());
                LIZ.append(", imsdk_is_login:");
                C96423qQ.LIZ();
                LIZ.append(C4Z2.LJIIZILJ());
                LIZ.append(", is_creator_enable:");
                LIZ.append(C55888Lwa.LIZIZ.LJJI(true));
                LIZ.append(", is_new_data_flow:");
                LIZ.append(C3TX.LIZIZ());
                LIZ.append('}');
                String LIZIZ = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("{total_dm_unread_count:");
                LIZ2.append(C82213Kn.LIZ().LIZJ());
                LIZ2.append(", inbox_dm_unread_count: ");
                LIZ2.append(IMServiceProvider.INSTANCE.getInboxDmService().getPostedDMUnreadInfo());
                LIZ2.append('}');
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                StringBuilder sb = new StringBuilder("{ ");
                if (C3TX.LIZIZ()) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C771431a.LIZ().LJLIL.LJLILLLLZI;
                    ArrayList arrayList = new ArrayList(concurrentHashMap.size());
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        arrayList.add(new OSZ(entry.getKey(), Integer.valueOf(((C3JS) entry.getValue()).LJIIIZ)));
                    }
                    for (Map.Entry entry2 : C113554cx.LJJLIIIJLJLI(arrayList).entrySet()) {
                        sb.append(((C81983Jq) entry2.getKey()).toString());
                        sb.append(":");
                        sb.append(((Number) entry2.getValue()).intValue());
                        sb.append(", ");
                    }
                } else {
                    for (Map.Entry entry3 : ((ConcurrentHashMap) C37O.LIZIZ().LJLJI).entrySet()) {
                        sb.append(((C81983Jq) entry3.getKey()).toString());
                        sb.append(":");
                        sb.append(((InterfaceC81953Jn) entry3.getValue()).getDebugInfo().toString());
                        sb.append(", ");
                    }
                }
                sb.append(" }");
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("{ status:");
                LIZ3.append(LIZIZ);
                LIZ3.append(", unread_count:");
                LIZ3.append(LIZIZ2);
                LIZ3.append(", invalid_conv_count:");
                LIZ3.append((Object) sb);
                LIZ3.append(" }");
                LJJLIL.put("inbox_meta_info", X1D.LIZIZ(LIZ3));
                StringBuilder sb2 = new StringBuilder("{ ");
                if (C3TX.LIZIZ()) {
                    for (Map.Entry entry4 : ((ConcurrentHashMap) C771431a.LIZ().LJLJJLL).entrySet()) {
                        sb2.append(entry4.getKey());
                        sb2.append(":{total_count:");
                        sb2.append(((InterfaceC82043Jw) entry4.getValue()).LIZIZ().size());
                        sb2.append(", private_count:");
                        List<C3L4> LIZIZ3 = ((InterfaceC82043Jw) entry4.getValue()).LIZIZ();
                        if ((LIZIZ3 instanceof Collection) && LIZIZ3.isEmpty()) {
                            i4 = 0;
                        } else {
                            Iterator<C3L4> it = LIZIZ3.iterator();
                            i4 = 0;
                            while (it.hasNext()) {
                                if ((it.next() instanceof C3L3) && (i4 = i4 + 1) < 0) {
                                    C47261Igj.LJJJJIZL();
                                    throw null;
                                }
                            }
                        }
                        sb2.append(i4);
                        sb2.append(", group_count:");
                        List<C3L4> LIZIZ4 = ((InterfaceC82043Jw) entry4.getValue()).LIZIZ();
                        if ((LIZIZ4 instanceof Collection) && LIZIZ4.isEmpty()) {
                            i5 = 0;
                        } else {
                            Iterator<C3L4> it2 = LIZIZ4.iterator();
                            i5 = 0;
                            while (it2.hasNext()) {
                                if ((it2.next() instanceof C3MY) && (i5 = i5 + 1) < 0) {
                                    C47261Igj.LJJJJIZL();
                                    throw null;
                                }
                            }
                        }
                        sb2.append(i5);
                        sb2.append("}, ");
                    }
                } else {
                    for (Map.Entry entry5 : ((ConcurrentHashMap) C37O.LIZIZ().LJLJI).entrySet()) {
                        sb2.append(entry5.getKey());
                        sb2.append(":{total_count:");
                        sb2.append(((InterfaceC81953Jn) entry5.getValue()).LJII().size());
                        sb2.append(", private_count:");
                        java.util.Map<String, C3L4> LJII = ((InterfaceC81953Jn) entry5.getValue()).LJII();
                        if (LJII.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator<Map.Entry<String, C3L4>> it3 = LJII.entrySet().iterator();
                            i = 0;
                            while (it3.hasNext()) {
                                if (it3.next().getValue() instanceof C3L3) {
                                    i++;
                                }
                            }
                        }
                        sb2.append(i);
                        sb2.append(", group_count:");
                        java.util.Map<String, C3L4> LJII2 = ((InterfaceC81953Jn) entry5.getValue()).LJII();
                        if (LJII2.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator<Map.Entry<String, C3L4>> it4 = LJII2.entrySet().iterator();
                            i2 = 0;
                            while (it4.hasNext()) {
                                if (it4.next().getValue() instanceof C3MY) {
                                    i2++;
                                }
                            }
                        }
                        sb2.append(i2);
                        sb2.append("}, ");
                    }
                }
                sb2.append(" }");
                int i6 = -1;
                if (C3TX.LIZIZ()) {
                    C3LG c3lg = C771431a.LIZ().LJLILLLLZI.LJLJJI;
                    if (c3lg != null) {
                        i3 = c3lg.LIZ;
                    }
                    i3 = -1;
                } else {
                    C3LG c3lg2 = C37O.LIZIZ().LJLLILLLL;
                    if (c3lg2 != null) {
                        i3 = c3lg2.LIZ;
                    }
                    i3 = -1;
                }
                if (C3TX.LIZIZ()) {
                    C3LG c3lg3 = C771431a.LIZ().LJLILLLLZI.LJLJJI;
                    if (c3lg3 != null) {
                        i6 = c3lg3.LIZIZ;
                    }
                } else {
                    C3LG c3lg4 = C37O.LIZIZ().LJLLILLLL;
                    if (c3lg4 != null) {
                        i6 = c3lg4.LIZIZ;
                    }
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("{ sessionCount:");
                LIZ4.append((Object) sb2);
                LIZ4.append(", stranger_count:");
                LIZ4.append(i3);
                LIZ4.append(", filtered_count:");
                LIZ4.append(i6);
                LIZ4.append(" }");
                LJJLIL.put("conversation_in_memory", X1D.LIZIZ(LIZ4));
                String sb3 = C3K4.LIZ.LIZLLL().toString();
                o.LJIIIIZZ(sb3, "tryBuildLog().toString()");
                LJJLIL.put("conversation_loading_logs", sb3);
                boolean LIZ5 = C113774dJ.LIZ();
                boolean LIZIZ5 = C92333jp.LIZIZ();
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("{ is_camera_on: ");
                LIZ6.append(LIZ5);
                LIZ6.append(", is_group_chat_on: ");
                LIZ6.append(LIZIZ5);
                LIZ6.append(" }");
                LJJLIL.put("feature_info", X1D.LIZIZ(LIZ6));
                return LJJLIL.toString();
            }

            @Override // X.InterfaceC106314Ff
            public final void LIZ() {
            }

            @Override // X.InterfaceC106314Ff
            public final C84683Ua LIZJ() {
                return C84683Ua.LJFF;
            }

            @Override // X.InterfaceC106314Ff
            public final void LIZIZ(View view, InterfaceC98193tH firstDrawCallback) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(firstDrawCallback, "firstDrawCallback");
                C82243Kq.LIZ(view, firstDrawCallback);
            }
        };
    }
}
