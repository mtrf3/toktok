package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.sdk.group.data.model.GroupCheckMsg;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3IY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IY {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C3IZ.LJLIL);

    public static String LIZIZ(C63120Opw c63120Opw) {
        C63088OpQ coreInfo;
        if (c63120Opw != null && (coreInfo = c63120Opw.getCoreInfo()) != null) {
            return coreInfo.getIcon();
        }
        return null;
    }

    public static UrlModel LIZJ(C63120Opw c63120Opw) {
        String LIZIZ;
        if (c63120Opw == null || (LIZIZ = LIZIZ(c63120Opw)) == null || LIZIZ.length() == 0) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C47261Igj.LJJIJIL(LIZIZ));
        return urlModel;
    }

    public static List LJ(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object obj : list) {
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    IMUser iMUser = (IMUser) next;
                    if (iMUser != null && o.LJ(iMUser.getUid(), currentUserID)) {
                        if (next != null) {
                            arrayList.remove(next);
                            ListProtector.add(arrayList, 0, next);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static void LIZLLL(long j, C86943b8 c86943b8) {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LIZIZ.LJIILJJIL(j, EnumC63479Ovj.GROUP_NAME, new EnumC96113pv[]{EnumC96113pv.ORDINARY, EnumC96113pv.OWNER, EnumC96113pv.MANAGER}, Boolean.FALSE, c86943b8);
    }

    public static void LIZ(C3IY c3iy, final List list, String createChannel, final MG5 scene, final String str, final InterfaceC88472Yns interfaceC88472Yns, int i) {
        if ((i & 4) != 0) {
            scene = MG5.CHAT;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            interfaceC88472Yns = null;
        }
        c3iy.getClass();
        o.LJIIIZ(createChannel, "createChannel");
        o.LJIIIZ(scene, "scene");
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LIZIZ.LJIIJJI(list, C91673il.LIZ(createChannel), new AnonymousClass379<C63120Opw>() { // from class: X.378
            @Override // X.InterfaceC86963bA
            public final void LIZIZ(C63623Oy3 c63623Oy3) {
                String str2;
                int i2;
                Integer statusCode;
                String str3;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onFailure, ");
                GroupCheckMsg groupCheckMsg = null;
                if (c63623Oy3 != null) {
                    str2 = c63623Oy3.toString();
                } else {
                    str2 = null;
                }
                LIZ2.append(str2);
                C34B.LJI("GroupManager", X1D.LIZIZ(LIZ2));
                C85163Vw.LIZJ(EF7.LIZIZ(), c63623Oy3, scene);
                InterfaceC88472Yns<C63120Opw, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(null);
                }
                if (c63623Oy3 != null && (str3 = c63623Oy3.LJ) != null) {
                    groupCheckMsg = (GroupCheckMsg) C62070OXq.LIZ(GroupCheckMsg.class, str3);
                }
                if (groupCheckMsg != null && (statusCode = groupCheckMsg.getStatusCode()) != null) {
                    i2 = statusCode.intValue();
                } else {
                    i2 = -1;
                }
                C90643h6.LJFF(i2, null, "group", list, "group", str, null, 192);
            }

            @Override // X.InterfaceC86963bA
            public final void onSuccess(Object obj) {
                String str2;
                C63120Opw c63120Opw = (C63120Opw) obj;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onSuccess, ");
                if (c63120Opw != null) {
                    str2 = c63120Opw.getConversationId();
                } else {
                    str2 = null;
                }
                C48690J9a.LJIIL(LIZ2, str2, LIZ2, "GroupManager");
                InterfaceC88472Yns<C63120Opw, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(c63120Opw);
                }
                C90643h6.LJFF(0, c63120Opw, "group", list, "group", str, null, 192);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
            
                if (r0.intValue() == 0) goto L23;
             */
            @Override // X.AnonymousClass379
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C63120Opw r14, X.C63623Oy3 r15) {
                /*
                    r13 = this;
                    r6 = r14
                    X.Opw r6 = (X.C63120Opw) r6
                    java.lang.StringBuilder r2 = X.X1D.LIZ()
                    java.lang.String r0 = "onSuccessWithInfo, "
                    r2.append(r0)
                    r5 = 0
                    if (r6 == 0) goto L92
                    java.lang.String r0 = r6.getConversationId()
                L13:
                    r2.append(r0)
                    r0 = 10
                    r2.append(r0)
                    if (r15 == 0) goto L90
                    java.lang.String r1 = r15.toString()
                L21:
                    java.lang.String r0 = "GroupManager"
                    X.C48690J9a.LJIIL(r2, r1, r2, r0)
                    if (r15 == 0) goto L8e
                    java.lang.String r1 = r15.LJ
                    if (r1 == 0) goto L8e
                    java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.data.model.GroupCheckMsg> r0 = com.ss.android.ugc.aweme.im.sdk.group.data.model.GroupCheckMsg.class
                    java.lang.Object r4 = X.C62070OXq.LIZ(r0, r1)
                    com.ss.android.ugc.aweme.im.sdk.group.data.model.GroupCheckMsg r4 = (com.ss.android.ugc.aweme.im.sdk.group.data.model.GroupCheckMsg) r4
                    if (r4 == 0) goto L5a
                    java.lang.String r3 = r4.getStatusMsg()
                    r2 = 1
                    if (r3 == 0) goto L52
                    int r0 = r3.length()
                    if (r0 <= 0) goto L52
                    X.5S1 r1 = new X.5S1
                    android.content.Context r0 = X.EF7.LIZIZ()
                    r1.<init>(r0)
                    r1.LIZLLL(r3)
                    r1.LJ()
                L52:
                    if (r4 == 0) goto L5a
                    java.lang.Integer r0 = r4.getStatusCode()
                    if (r0 != 0) goto L87
                L5a:
                    r2 = 0
                L5b:
                    X.Yns<X.Opw, X.UCe> r0 = r1
                    if (r2 == 0) goto L81
                    if (r0 == 0) goto L64
                    r0.invoke(r6)
                L64:
                    if (r4 == 0) goto L7f
                    java.lang.Integer r0 = r4.getStatusCode()
                    if (r0 == 0) goto L7f
                    int r5 = r0.intValue()
                L70:
                    java.lang.String r7 = "group"
                    java.util.List<java.lang.String> r8 = r2
                    java.lang.String r9 = "group"
                    java.lang.String r10 = r3
                    r11 = 0
                    r12 = 192(0xc0, float:2.69E-43)
                    X.C90643h6.LJFF(r5, r6, r7, r8, r9, r10, r11, r12)
                    return
                L7f:
                    r5 = -1
                    goto L70
                L81:
                    if (r0 == 0) goto L64
                    r0.invoke(r5)
                    goto L64
                L87:
                    int r0 = r0.intValue()
                    if (r0 != 0) goto L5a
                    goto L5b
                L8e:
                    r4 = r5
                    goto L5a
                L90:
                    r1 = r5
                    goto L21
                L92:
                    r0 = r5
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass378.LIZ(java.lang.Object, X.Oy3):void");
            }
        });
    }
}
