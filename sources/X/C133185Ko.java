package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ko, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133185Ko extends AbstractC65781Prl implements InterfaceC88472Yns<OSZ<? extends Boolean, ? extends List<? extends NLETrackSlot>>, C76800UCe> {
    public final /* synthetic */ C5OO LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C133185Ko(C5OO c5oo) {
        super(1);
        this.LJLIL = c5oo;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(OSZ<? extends Boolean, ? extends List<? extends NLETrackSlot>> osz) {
        String str;
        NLETrackSlot first;
        ViewGroup viewGroup;
        Object obj;
        NLETrackSlot first2;
        OSZ<? extends Boolean, ? extends List<? extends NLETrackSlot>> it = osz;
        o.LJIIIZ(it, "it");
        C5O8 c5o8 = this.LJLIL.LLFZ;
        if (c5o8 != null) {
            List<? extends NLETrackSlot> newSlots = it.getSecond();
            boolean booleanValue = it.getFirst().booleanValue();
            o.LJIIIZ(newSlots, "newSlots");
            java.util.Map<NLETrackSlot, C5CP> map = c5o8.LJLJJL;
            if (c5o8.LJLL) {
                OSZ<? extends NLETrackSlot, C5CP> osz2 = c5o8.LJLJL;
                if (osz2 != null && (first2 = osz2.getFirst()) != null) {
                    Iterator<? extends NLETrackSlot> it2 = newSlots.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        NLETrackSlot next = it2.next();
                        if (o.LJ(next.getUUID(), first2.getUUID())) {
                            first2.setStartTime(next.getStartTime());
                            first2.setEndTime(next.getEndTime());
                            break;
                        }
                    }
                }
            } else {
                List<NLETrackSlot> LJIIJ = c5o8.LJLJI.LJIIJ();
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                arrayList.addAll(linkedHashMap.keySet());
                for (NLETrackSlot nLETrackSlot : newSlots) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            NLENode nLENode = (NLENode) obj;
                            if (booleanValue) {
                                if (nLENode.getId() == nLETrackSlot.getId()) {
                                    break;
                                }
                            } else if (o.LJ(nLENode.getUUID(), nLETrackSlot.getUUID())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
                    if (nLETimeSpaceNode != null && !C17J.LJJIL(nLETrackSlot)) {
                        nLETimeSpaceNode.setStartTime(nLETrackSlot.getStartTime());
                        nLETimeSpaceNode.setEndTime(nLETrackSlot.getEndTime());
                        arrayList.remove(nLETimeSpaceNode);
                    } else {
                        boolean contains = LJIIJ.contains(nLETrackSlot);
                        Context context = c5o8.getContext();
                        o.LJIIIIZZ(context, "context");
                        C5CP c5cp = new C5CP(nLETrackSlot, false, contains, context, null, 0, c5o8.LJLJI);
                        if (c5o8.LJLLJ) {
                            c5cp.setVisibility(8);
                        }
                        c5o8.addView(c5cp);
                        linkedHashMap.put(nLETrackSlot, c5cp);
                    }
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    NLENode nLENode2 = (NLENode) it4.next();
                    View view = (View) linkedHashMap.get(nLENode2);
                    if (view != null) {
                        ViewParent parent = view.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                            C16880lQ.LJLLL(view, viewGroup);
                        }
                    }
                    linkedHashMap.remove(nLENode2);
                    OSZ<? extends NLETrackSlot, C5CP> osz3 = c5o8.LJLJL;
                    if (osz3 != null && (first = osz3.getFirst()) != null) {
                        str = first.getUUID();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, nLENode2.getUUID())) {
                        c5o8.LJIIIIZZ();
                    }
                }
                c5o8.requestLayout();
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("singleTrackView");
        throw null;
    }
}
