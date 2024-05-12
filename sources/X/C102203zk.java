package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102203zk implements InterfaceC99673vf, InterfaceC87502YVu {
    public final String LJLIL;
    public final Aweme LJLILLLLZI;
    public final boolean LJLJI;
    public final Boolean LJLJJI;
    public final boolean LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final List<C109544Rq> LJLJL;
    public final C62822Ol8 LJLJLJ;
    public AbstractC102243zo LJLJLLL;
    public int LJLL;
    public final long LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public InterfaceC102233zn LJLLL;
    public final java.util.Set<String> LJLLLL;

    @Override // X.InterfaceC87502YVu
    public final List<OSZ<Aweme, Long>> LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void T1(C109544Rq c109544Rq) {
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void ea(C109544Rq c109544Rq, boolean z) {
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void m4(int i, C109544Rq c109544Rq, C63540Owi c63540Owi) {
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void u7(int i, C109544Rq c109544Rq) {
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void v6(C109544Rq c109544Rq, java.util.Map<String, List<C32H>> map, java.util.Map<String, List<C32H>> map2, Long l, Long l2) {
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void y(C109544Rq c109544Rq) {
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void y5(int i, C63219OrX c63219OrX) {
    }

    @Override // X.InterfaceC87502YVu
    public final void LIZIZ() {
        C34B.LIZIZ("IMAwemeIdProvider", "unregister");
        AbstractC102243zo abstractC102243zo = this.LJLJLLL;
        if (abstractC102243zo != null) {
            abstractC102243zo.LIZIZ();
        }
        LJIIIIZZ().clear();
        this.LJLL = 0;
        this.LJLLL = null;
    }

    public final List<C109544Rq> LJIIIIZZ() {
        return (List) this.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC87502YVu
    public final void refresh() {
        C34B.LIZIZ("IMAwemeIdProvider", "refresh");
        boolean z = true;
        boolean z2 = false;
        if (this.LJLL != 0) {
            return;
        }
        List LJIIIZ = LJIIIZ(1, this.LJLLI);
        if ((!LJIIIZ.isEmpty()) && (!LJIIIIZZ().isEmpty())) {
            if (LJIIIIZZ().indexOf(ORZ.LLFF(LJIIIZ)) >= LJIIIIZZ().size() - 1) {
                z = false;
            }
            z2 = z;
        }
        InterfaceC102233zn interfaceC102233zn = this.LJLLL;
        if (interfaceC102233zn != null) {
            interfaceC102233zn.LIZIZ(LJIIJ(LJIIIZ, z2));
        }
    }

    @Override // X.InterfaceC87502YVu
    public final boolean LIZJ() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC87502YVu
    public final boolean LJI() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC87502YVu
    public final Aweme getCurrentAweme() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC87502YVu
    public final long getStartIndex() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC87502YVu
    public final void LIZ(InterfaceC102233zn callback) {
        o.LJIIIZ(callback, "callback");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("register: startIndex: ");
        LIZ.append(this.LJLLI);
        C34B.LIZIZ("IMAwemeIdProvider", X1D.LIZIZ(LIZ));
        String conversationId = this.LJLIL;
        o.LJIIIZ(conversationId, "conversationId");
        C4SL LJIIJJI = C96413qP.LIZ.LJIIJJI(conversationId, new int[]{8, 11, 1809});
        LJIIJJI.LIZJ(this);
        LJIIJJI.LIZLLL().addAll(this.LJLJL);
        this.LJLJLLL = LJIIJJI;
        List<C109544Rq> list = this.LJLJL;
        LJIIIIZZ().clear();
        if (list != null && !((ArrayList) list).isEmpty()) {
            LJIIIIZZ().addAll(ORZ.LLIILII(list));
        }
        this.LJLLILLLL = true;
        this.LJLLJ = true;
        this.LJLLL = callback;
    }

    @Override // X.InterfaceC87502YVu
    public final void LJ(long j) {
        StringBuilder LIZJ = V10.LIZJ("loadNewer: ", j, ", ");
        LIZJ.append(this.LJLLILLLL);
        C34B.LIZIZ("IMAwemeIdProvider", X1D.LIZIZ(LIZJ));
        boolean z = true;
        boolean z2 = false;
        if (this.LJLL != 0 || !this.LJLJJL) {
            return;
        }
        List LJIIIZ = LJIIIZ(3, j);
        if ((!LJIIIZ.isEmpty()) && (!LJIIIIZZ().isEmpty())) {
            if (LJIIIIZZ().indexOf(ORZ.LLFF(LJIIIZ)) >= LJIIIIZZ().size() - 1) {
                z = false;
            }
            z2 = z;
        }
        InterfaceC102233zn interfaceC102233zn = this.LJLLL;
        if (interfaceC102233zn == null) {
            return;
        }
        interfaceC102233zn.LIZJ(LJIIJ(LJIIIZ, z2));
    }

    @Override // X.InterfaceC87502YVu
    public final void LJFF(long j) {
        StringBuilder LIZJ = V10.LIZJ("loadOlder: ", j, ", ");
        LIZJ.append(this.LJLLJ);
        C34B.LIZIZ("IMAwemeIdProvider", X1D.LIZIZ(LIZJ));
        if (this.LJLL != 0 || !this.LJLJJL) {
            return;
        }
        List LJIIIZ = LJIIIZ(2, j);
        if (!LJIIIZ.isEmpty()) {
            InterfaceC102233zn interfaceC102233zn = this.LJLLL;
            if (interfaceC102233zn != null) {
                interfaceC102233zn.LIZ(LJIIJ(LJIIIZ, true));
                return;
            }
            return;
        }
        if (this.LJLLJ) {
            this.LJLL = 2;
            AbstractC102243zo abstractC102243zo = this.LJLJLLL;
            if (abstractC102243zo == null) {
                return;
            }
            abstractC102243zo.LIZ();
            return;
        }
        InterfaceC102233zn interfaceC102233zn2 = this.LJLLL;
        if (interfaceC102233zn2 == null) {
            return;
        }
        interfaceC102233zn2.LIZ(LJIIJ(null, false));
    }

    @Override // X.InterfaceC87502YVu
    public final void deleteItem(String aid) {
        o.LJIIIZ(aid, "aid");
        ((HashSet) this.LJLJJLL.getValue()).add(aid);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00db, code lost:
    
        if ((!((java.util.ArrayList) X.C85183Vy.LIZ(r1, r0, r2)).isEmpty()) != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C109544Rq> LJII(java.util.List<? extends X.C109544Rq> r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102203zk.LJII(java.util.List, boolean):java.util.List");
    }

    public final List LJIIIZ(int i, long j) {
        int min;
        if (LJIIIIZZ().size() <= 0) {
            return new ArrayList();
        }
        int i2 = 0;
        for (C109544Rq c109544Rq : LJIIIIZZ()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (c109544Rq.getIndex() == j) {
                    int size = LJIIIIZZ().size();
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3 && i2 != size - 1) {
                                min = i2 + 1;
                                i2 = Math.min(min + 7, size);
                            }
                        } else if (i2 != 0) {
                            min = Math.max(0, i2 - 7);
                        }
                        return new ArrayList();
                    }
                    int max = Math.max(0, i2 - 3);
                    i2 = Math.min(max + 7, size);
                    min = Math.min(max, Math.max(0, i2 - 7));
                    if (min >= 0 && i2 >= 0) {
                        return LJIIIIZZ().subList(min, i2);
                    }
                    return new ArrayList();
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return new ArrayList();
    }

    public final C102283zs LJIIJ(List<? extends C109544Rq> list, boolean z) {
        Integer num;
        C4J7 c4j7;
        ShareAwemeContent shareAwemeContent;
        String itemId;
        VideoCoverComponent videoCoverComponent;
        String str;
        CommentContent commentContent;
        String awemeId;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("packResponse: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C34B.LIZIZ("IMAwemeIdProvider", X1D.LIZIZ(LIZ));
        if (list == null || list.isEmpty()) {
            return new C102283zs(C61878OQg.INSTANCE, z);
        }
        ArrayList arrayList = new ArrayList();
        for (C109544Rq c109544Rq : list) {
            if (!C93793mB.LJIIZILJ(c109544Rq)) {
                arrayList.add(c109544Rq);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C109544Rq c109544Rq2 = (C109544Rq) it.next();
            int msgType = c109544Rq2.getMsgType();
            if (msgType != 8 && msgType != 11) {
                if (msgType != 40) {
                    if (msgType != 1809) {
                        if (msgType != 1802) {
                            if (msgType == 1803) {
                                Aweme LJJJLL = C78939UyV.LJJJLL(c109544Rq2, this.LJLJJI);
                                String aid = LJJJLL.getAid();
                                o.LJIIIIZZ(aid, "toAweme.aid");
                                c4j7 = new C4J7(LJJJLL, c109544Rq2.getIndex(), aid);
                            }
                        } else {
                            Aweme LJJJLIIL = C78939UyV.LJJJLIIL(c109544Rq2, this.LJLJJI);
                            String aid2 = LJJJLIIL.getAid();
                            o.LJIIIIZZ(aid2, "toAweme.aid");
                            c4j7 = new C4J7(LJJJLIIL, c109544Rq2.getIndex(), aid2);
                        }
                        arrayList2.add(c4j7);
                    } else {
                        AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) C1DJ.LJIILL(c109544Rq2);
                        if (awemeCardTemplate != null && (videoCoverComponent = awemeCardTemplate.baseVideoComponent) != null && (str = videoCoverComponent.id) != null && str.length() != 0 && !((HashSet) this.LJLJJLL.getValue()).contains(str)) {
                            c4j7 = new C4J7(AwemeService.LIZ().i6(str), c109544Rq2.getIndex(), str);
                            arrayList2.add(c4j7);
                        }
                    }
                } else {
                    EnumC110124Tw.Companion.getClass();
                    BaseContent LIZJ = C110134Tx.LIZJ(c109544Rq2);
                    if ((LIZJ instanceof CommentContent) && (commentContent = (CommentContent) LIZJ) != null && (awemeId = commentContent.getAwemeId()) != null && awemeId.length() != 0 && !((HashSet) this.LJLJJLL.getValue()).contains(awemeId)) {
                        Aweme i6 = AwemeService.LIZ().i6(awemeId);
                        if (!IMService.createIIMServicebyMonsterPlugin(false).getImVideoService().LIZIZ()) {
                            i6 = null;
                        }
                        c4j7 = new C4J7(i6, c109544Rq2.getIndex(), awemeId);
                        arrayList2.add(c4j7);
                    }
                }
            } else {
                EnumC110124Tw.Companion.getClass();
                BaseContent LIZJ2 = C110134Tx.LIZJ(c109544Rq2);
                if ((LIZJ2 instanceof ShareAwemeContent) && (shareAwemeContent = (ShareAwemeContent) LIZJ2) != null && (itemId = shareAwemeContent.getItemId()) != null && itemId.length() != 0 && !((HashSet) this.LJLJJLL.getValue()).contains(itemId)) {
                    Aweme i62 = AwemeService.LIZ().i6(itemId);
                    if (!IMService.createIIMServicebyMonsterPlugin(false).getImVideoService().LIZIZ()) {
                        i62 = null;
                    }
                    c4j7 = new C4J7(i62, c109544Rq2.getIndex(), itemId);
                    arrayList2.add(c4j7);
                }
            }
        }
        return new C102283zs(arrayList2, z);
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void M1(List<C109544Rq> list, boolean z) {
        Integer num;
        boolean z2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadOlder: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", ");
        LIZ.append(LJIIIIZZ().size());
        LIZ.append(", ");
        LIZ.append(z);
        C34B.LIZIZ("IMAwemeIdProvider", X1D.LIZIZ(LIZ));
        if (!z) {
            return;
        }
        if (list == null || list.isEmpty() || list.size() < 7) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LJLLJ = z2;
        List<? extends C109544Rq> LLIILII = ORZ.LLIILII(LJII(list, true));
        if (LLIILII != null && !LLIILII.isEmpty()) {
            LJIIIIZZ().addAll(0, LLIILII);
        }
        InterfaceC102233zn interfaceC102233zn = this.LJLLL;
        if (interfaceC102233zn != null) {
            interfaceC102233zn.LIZ(LJIIJ(LLIILII, this.LJLLJ));
        }
        this.LJLL = 0;
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void v0(List<C109544Rq> list, boolean z) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadNewer: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C34B.LIZIZ("IMAwemeIdProvider", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void K7(int i, String str, List list) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onQueryMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C34B.LIZIZ("IMAwemeIdProvider", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void X8(java.util.Map map, int i, List list) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUpdateMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C34B.LIZIZ("IMAwemeIdProvider", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void x6(List<C109544Rq> list, int i, C107074Id extra) {
        Integer num;
        o.LJIIIZ(extra, "extra");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGetMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(' ');
        LIZ.append(i);
        LIZ.append("  ");
        LIZ.append(extra);
        C34B.LIZIZ("IMAwemeIdProvider", X1D.LIZIZ(LIZ));
    }

    public C102203zk(String str, C109544Rq curMessage, Aweme aweme, boolean z, Boolean bool, boolean z2, List<? extends C109544Rq> originMessages) {
        o.LJIIIZ(curMessage, "curMessage");
        o.LJIIIZ(originMessages, "originMessages");
        this.LJLIL = str;
        this.LJLILLLLZI = aweme;
        this.LJLJI = z;
        this.LJLJJI = bool;
        this.LJLJJL = z2;
        this.LJLJJLL = C221108m2.LIZIZ(C98933uT.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(C98943uU.LJLIL);
        this.LJLLI = curMessage.getIndex();
        this.LJLLILLLL = true;
        this.LJLLJ = true;
        this.LJLLLL = new LinkedHashSet();
        List<C109544Rq> LJII = LJII(originMessages, false);
        this.LJLJL = LJII;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJII).iterator();
        while (it.hasNext()) {
            String LIZ = C93793mB.LIZ((C109544Rq) it.next());
            if (LIZ != null) {
                arrayList.add(LIZ);
            }
        }
        this.LJLLLL = ORZ.LLJILLL(arrayList);
    }
}
