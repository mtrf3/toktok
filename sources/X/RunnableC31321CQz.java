package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.livestreamv2.filter.FilterManager;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CQz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC31321CQz implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean booleanValue;
        boolean z;
        int LJII;
        switch (this.LJLIL) {
            case 0:
                C31319CQx c31319CQx = (C31319CQx) this.LJLILLLLZI;
                List<CRD> list = (List) this.LJLJI;
                c31319CQx.getClass();
                if (list.isEmpty() || c31319CQx.mView == 0) {
                    return;
                }
                if (c31319CQx.LLJJI) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C31319CQx.LJJJJLI((CRD) it.next());
                    }
                }
                c31319CQx.LLJ = Long.valueOf(SystemClock.uptimeMillis());
                ((LinkedList) c31319CQx.LLILLJJLI).clear();
                if (((CRA) c31319CQx.mView).v8() == CT0.NORMAL) {
                    int LJI = c31319CQx.LJZI.LJI();
                    int size = list.size() + c31319CQx.LJZI.LJII();
                    if (size > c31319CQx.LJJLIIIJILLIZJL()) {
                        c31319CQx.LLFII = true;
                        CRA cra = (CRA) c31319CQx.mView;
                        if (c31319CQx.LJZL.LIZIZ() && !c31319CQx.LLFII) {
                            z = true;
                        } else {
                            z = false;
                        }
                        cra.js(z);
                        int LJJLIIIJILLIZJL = size - ((int) ((c31319CQx.LJJLIIIJILLIZJL() / 200.0f) * 130.0f));
                        if (LJJLIIIJILLIZJL <= c31319CQx.LJZI.LJII()) {
                            LJII = LJJLIIIJILLIZJL;
                        } else {
                            LJII = c31319CQx.LJZI.LJII();
                            list.subList(0, LJJLIIIJILLIZJL - LJII).clear();
                        }
                        List<CRD> subList = c31319CQx.LJZI.LIZIZ.subList(0, LJII);
                        o.LJIIIIZZ(subList, "rawList.subList(fromIndex, toIndex)");
                        ArrayList arrayList = new ArrayList(subList);
                        ArrayList arrayList2 = new ArrayList();
                        for (int i = 0; i < arrayList.size(); i++) {
                            CRD crd = (CRD) ListProtector.get(arrayList, i);
                            c31319CQx.LJZI.LJIIIZ(crd);
                            crd.dispose();
                            if (crd instanceof InterfaceC31337CRp) {
                                InterfaceC31337CRp interfaceC31337CRp = (InterfaceC31337CRp) crd;
                                if (interfaceC31337CRp.LJJJJZI() != null) {
                                    arrayList2.add(interfaceC31337CRp);
                                }
                            }
                        }
                        c31319CQx.LJIILJJIL(arrayList2);
                        int LJI2 = LJI - c31319CQx.LJZI.LJI();
                        if (LJI2 > 0) {
                            ((CRA) c31319CQx.mView).Bi0(0, LJI2);
                        }
                        StringBuilder LIZJ = C06460Ne.LIZJ("shoulddelete=", LJJLIIIJILLIZJL, "desiredCropCount=", LJII, "realCropCount=");
                        b1.LJ(LIZJ, LJI2, LIZJ, "cropmessage");
                    }
                }
                if (c31319CQx.LJJL()) {
                    int LJI3 = c31319CQx.LJZI.LJI();
                    c31319CQx.LJZI.LIZIZ(list);
                    int LJI4 = c31319CQx.LJZI.LJI() - LJI3;
                    if (LJI4 > 0) {
                        ((CRA) c31319CQx.mView).OC(LJI3, LJI4);
                    }
                } else {
                    if (!c31319CQx.LJZI.LIZIZ.isEmpty()) {
                        CR1<CRD> cr1 = c31319CQx.LJZI;
                        CRD LJ = cr1.LJ(cr1.LJII() - 1);
                        if (LJ != null && LJ.LJJJJ()) {
                            int LJIIIIZZ = c31319CQx.LJZI.LJIIIIZZ(LJ);
                            int LJI5 = c31319CQx.LJZI.LJI();
                            c31319CQx.LJZI.LJIIIZ(LJ);
                            c31319CQx.LJZI.LIZIZ(list);
                            c31319CQx.LJZI.LIZ(LJ);
                            int LJI6 = c31319CQx.LJZI.LJI() - LJI5;
                            if (LJIIIIZZ != -1 && LJI6 > 0) {
                                ((CRA) c31319CQx.mView).OC(LJIIIIZZ, LJI6);
                            }
                        }
                    }
                    int LJI7 = c31319CQx.LJZI.LJI();
                    c31319CQx.LJZI.LIZIZ(list);
                    int LJI8 = c31319CQx.LJZI.LJI() - LJI7;
                    if (LJI8 > 0) {
                        ((CRA) c31319CQx.mView).OC(LJI7, LJI8);
                    }
                }
                for (CRD crd2 : list) {
                    if (crd2.LJ()) {
                        c31319CQx.LLILZLL = false;
                    }
                    CQQ cqq = c31319CQx.LLIILZL;
                    if (cqq.LIZLLL && c31319CQx.LLJILJILJ == 1) {
                        if (cqq.LJFF) {
                            booleanValue = InterfaceC30442Bx8.y0.LIZJ().booleanValue();
                        } else {
                            booleanValue = InterfaceC30442Bx8.v0.LIZJ().booleanValue();
                        }
                        if (booleanValue && c31319CQx.LLJILLL.LJII(crd2)) {
                            if (c31319CQx.LLIILZL.LJFF) {
                                InterfaceC30442Bx8.y0.LIZ(Boolean.FALSE);
                            } else {
                                InterfaceC30442Bx8.v0.LIZ(Boolean.FALSE);
                            }
                            RoomMessage roomMessage = new RoomMessage();
                            CommonMessageData commonMessageData = new CommonMessageData();
                            commonMessageData.roomId = c31319CQx.LLIILZL.LJIIJJI;
                            commonMessageData.showMsg = true;
                            roomMessage.baseMessage = commonMessageData;
                            C29419Bgd c29419Bgd = new C29419Bgd(roomMessage);
                            c29419Bgd.LJIJJLI(c31319CQx.LLIILZL);
                            c31319CQx.LJLIL.LJI(c29419Bgd);
                            c31319CQx.LJLJI(false, c29419Bgd, true);
                        }
                    }
                    if ((!CUE.LIZ) && (crd2 instanceof InterfaceC31337CRp)) {
                        InterfaceC31337CRp interfaceC31337CRp2 = (InterfaceC31337CRp) crd2;
                        if (((CRA) c31319CQx.mView).v8() == CT0.FOCUS && interfaceC31337CRp2.LJJJJZI() != null) {
                            c31319CQx.LJJ(interfaceC31337CRp2, false);
                        }
                        if (((CRA) c31319CQx.mView).v8() == CT0.NORMAL && C31319CQx.LJJLI(c31319CQx.LLIILZL.LJFF).LIZIZ() && interfaceC31337CRp2.LJJJJZI() != null) {
                            ((LinkedList) c31319CQx.LLILLJJLI).add(interfaceC31337CRp2);
                        }
                    }
                    if (crd2 instanceof CQO) {
                        c31319CQx.LJJJLZIJ((CQO) crd2);
                    }
                }
                return;
            case 1:
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) this.LJLILLLLZI;
                Object obj = this.LJLJI;
                liveEmojiInputDialogFragment.getClass();
                if (obj == EnumC09680Zo.Keyboard) {
                    C79057V0z.LJJJJZ(liveEmojiInputDialogFragment.getContext(), liveEmojiInputDialogFragment.LLI);
                    return;
                } else {
                    liveEmojiInputDialogFragment.Hl();
                    return;
                }
            default:
                ((FilterManager) this.LJLILLLLZI).lambda$setEffectInfoChangeListener$3((IVideoEffectProcessor.IEffectInfoChangeListener) this.LJLJI);
                return;
        }
    }

    public /* synthetic */ RunnableC31321CQz(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
