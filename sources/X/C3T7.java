package X;

import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.3T7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3T7 extends C82673Mh {
    public final C39N LJLILLLLZI = C39N.INBOX;
    public final java.util.Map<String, InterfaceC98683u4> LJLJI = new ConcurrentHashMap();
    public final java.util.Map<String, CharSequence> LJLJJI = new ConcurrentHashMap();
    public final java.util.Map<String, Boolean> LJLJJL = new ConcurrentHashMap();

    @Override // X.C3MX
    public final C39N LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.C82673Mh, X.C3MX
    public final void LIZIZ(List<? extends C3L4> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "sessionList");
        for (C3L4 c3l4 : list) {
            if ((c3l4 instanceof C3L3) && !(c3l4 instanceof C3LK)) {
                LJ.add(c3l4);
            }
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJ, 10));
        Iterator it = LJ.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3L4) it.next()).LJFF());
        }
        java.util.Set LLJJ = ORZ.LLJJ(arrayList);
        java.util.Set keySet = ((ConcurrentHashMap) this.LJLJI).keySet();
        java.util.Set LLILIL = ORZ.LLILIL(keySet, LLJJ);
        java.util.Set<String> LLILIL2 = ORZ.LLILIL(LLJJ, keySet);
        for (Object obj : LLILIL) {
            ((ConcurrentHashMap) this.LJLJJI).remove(obj);
            ((ConcurrentHashMap) this.LJLJJL).remove(obj);
            Object remove = ((ConcurrentHashMap) this.LJLJI).remove(obj);
            if (remove != null) {
                CopyOnWriteArrayList<InterfaceC98683u4> copyOnWriteArrayList = C98693u5.LJ;
                if (copyOnWriteArrayList.contains(remove)) {
                    copyOnWriteArrayList.remove(remove);
                }
            }
        }
        for (final String sessionId : LLILIL2) {
            if (!((ConcurrentHashMap) this.LJLJI).containsKey(sessionId)) {
                o.LJIIIIZZ(sessionId, "sessionId");
                InterfaceC98683u4 interfaceC98683u4 = new InterfaceC98683u4(sessionId, this) { // from class: X.3T6
                    public boolean LJLIL;
                    public final String LJLILLLLZI;
                    public final /* synthetic */ String LJLJI;
                    public final /* synthetic */ C3T7 LJLJJI;

                    @Override // X.InterfaceC98683u4
                    public final void LJIL() {
                        this.LJLIL = false;
                        ((ConcurrentHashMap) this.LJLJJI.LJLJJI).remove(this.LJLJI);
                        ((ConcurrentHashMap) this.LJLJJI.LJLJJL).remove(this.LJLJI);
                        C3T5 c3t5 = new C3T5("", this.LJLJI, false);
                        InterfaceC88472Yns<? super InterfaceC82853Mz, C76800UCe> interfaceC88472Yns = this.LJLJJI.LJLIL;
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke(c3t5);
                        }
                    }

                    @Override // X.InterfaceC98683u4
                    public final void LLFII() {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("showTypingStatus: ");
                        LIZ.append(this.LJLJI);
                        C81843Jc.LIZIZ("SessionRefactor-SessionVOTypingDecorator", X1D.LIZIZ(LIZ));
                        this.LJLIL = true;
                        C3T7 c3t7 = this.LJLJJI;
                        String str = this.LJLJI;
                        CharSequence charSequence = (CharSequence) ((ConcurrentHashMap) c3t7.LJLJJI).get(str);
                        if (charSequence == null) {
                            charSequence = C1DD.LIZLLL(R.string.ev6, "AppContextManager.getApp…ring.dm_typing_indicator)");
                        }
                        ((ConcurrentHashMap) c3t7.LJLJJI).put(str, charSequence);
                        ((ConcurrentHashMap) c3t7.LJLJJL).put(str, Boolean.TRUE);
                        C3T5 c3t5 = new C3T5(charSequence, this.LJLJI, true);
                        InterfaceC88472Yns<? super InterfaceC82853Mz, C76800UCe> interfaceC88472Yns = this.LJLJJI.LJLIL;
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke(c3t5);
                        }
                    }

                    @Override // X.InterfaceC98683u4
                    public final boolean LJLIIIL() {
                        return this.LJLIL;
                    }

                    @Override // X.InterfaceC98683u4
                    public final String getSessionId() {
                        return this.LJLILLLLZI;
                    }

                    {
                        this.LJLJI = sessionId;
                        this.LJLJJI = this;
                        this.LJLILLLLZI = sessionId;
                    }
                };
                ((ConcurrentHashMap) this.LJLJI).put(sessionId, interfaceC98683u4);
                C98693u5.LIZ(interfaceC98683u4);
            }
        }
    }

    @Override // X.C3MX
    public final void LJ(InterfaceC82723Mm sessionVO) {
        boolean z;
        o.LJIIIZ(sessionVO, "sessionVO");
        if (!(sessionVO instanceof C3TO)) {
            return;
        }
        C3TO c3to = (C3TO) sessionVO;
        CharSequence charSequence = (CharSequence) ((ConcurrentHashMap) this.LJLJJI).get(sessionVO.getSessionId());
        if (charSequence == null) {
            charSequence = "";
        }
        c3to.setTypingStatusText(charSequence);
        Boolean bool = (Boolean) ((ConcurrentHashMap) this.LJLJJL).get(sessionVO.getSessionId());
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        c3to.setShowingTypingStatus(z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("typingStatusText: ");
        LIZ.append((Object) c3to.getTypingStatusText());
        LIZ.append("  isShowingTypingStatus:");
        LIZ.append(c3to.isShowingTypingStatus());
        C81843Jc.LIZIZ("SessionRefactor-SessionVOTypingDecorator", X1D.LIZIZ(LIZ));
    }
}
