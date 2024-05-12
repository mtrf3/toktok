package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vast.model.AdVerification;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import kotlin.jvm.internal.o;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import ujb.s;

/* renamed from: X.NNq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59262NNq {
    public final C59255NNj LIZ;
    public final InterfaceC59268NNw LIZIZ;
    public final InterfaceC59264NNs LIZJ;
    public final XPath LIZLLL;
    public int LJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59262NNq(C59255NNj vast) {
        this(vast, (InterfaceC59268NNw) null, 6);
        o.LJIIIZ(vast, "vast");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59262NNq(C59255NNj vast, InterfaceC59268NNw interfaceC59268NNw) {
        this(vast, interfaceC59268NNw, 4);
        o.LJIIIZ(vast, "vast");
    }

    public final void LIZIZ(Node node) {
        XPath xpath = this.LIZLLL;
        o.LJIIIIZZ(xpath, "xpath");
        C51652KOy LIZLLL = C59265NNt.LIZLLL(xpath, node, "./Error");
        XPath xpath2 = this.LIZLLL;
        o.LJIIIIZZ(xpath2, "xpath");
        C115524g8 c115524g8 = new C115524g8((C115534g9) C59265NNt.LIZIZ(LIZLLL, xpath2));
        while (c115524g8.hasNext()) {
            Object next = c115524g8.next();
            C59255NNj c59255NNj = this.LIZ;
            c59255NNj.errorSet = C77357UXp.LIZJ(c59255NNj.errorSet, next);
        }
        XPath xpath3 = this.LIZLLL;
        o.LJIIIIZZ(xpath3, "xpath");
        C51652KOy LIZLLL2 = C59265NNt.LIZLLL(xpath3, node, "./Impression");
        XPath xpath4 = this.LIZLLL;
        o.LJIIIIZZ(xpath4, "xpath");
        C115524g8 c115524g82 = new C115524g8((C115534g9) C59265NNt.LIZIZ(LIZLLL2, xpath4));
        while (c115524g82.hasNext()) {
            Object next2 = c115524g82.next();
            C59255NNj c59255NNj2 = this.LIZ;
            c59255NNj2.impressionSet = C77357UXp.LIZJ(c59255NNj2.impressionSet, next2);
        }
        XPath xpath5 = this.LIZLLL;
        o.LJIIIIZZ(xpath5, "xpath");
        C51651KOx c51651KOx = new C51651KOx(C59265NNt.LIZLLL(xpath5, node, "./AdVerifications/Verification", "./Extension[@type='AdVerifications']/AdVerifications/Verification", "./Extensions/Extension[@type='AdVerifications']/AdVerifications/Verification"));
        while (c51651KOx.LIZ()) {
            Object next3 = c51651KOx.next();
            AdVerification adVerification = new AdVerification();
            String evaluate = this.LIZLLL.evaluate("./@vendor", next3);
            o.LJIIIIZZ(evaluate, "xpath.evaluate(\"./@vendor\", verificationNode)");
            adVerification.vender = s.LJZI(evaluate).toString();
            String evaluate2 = this.LIZLLL.evaluate("./JavaScriptResource/text()", next3);
            o.LJIIIIZZ(evaluate2, "xpath.evaluate(\"./JavaSc…ext()\", verificationNode)");
            adVerification.javascriptResource = s.LJZI(evaluate2).toString();
            String evaluate3 = this.LIZLLL.evaluate("./VerificationParameters/text()", next3);
            o.LJIIIIZZ(evaluate3, "xpath.evaluate(\"./Verifi…ext()\", verificationNode)");
            adVerification.verificationParameters = s.LJZI(evaluate3).toString();
            C59255NNj c59255NNj3 = this.LIZ;
            c59255NNj3.adVerificationList = C77357UXp.LIZIZ(adVerification, c59255NNj3.adVerificationList);
        }
        XPath xpath6 = this.LIZLLL;
        o.LJIIIIZZ(xpath6, "xpath");
        C51651KOx c51651KOx2 = new C51651KOx(C59265NNt.LIZLLL(xpath6, node, "./ViewableImpression"));
        while (c51651KOx2.LIZ()) {
            Object next4 = c51651KOx2.next();
            XPath xpath7 = this.LIZLLL;
            o.LJIIIIZZ(xpath7, "xpath");
            C51652KOy LIZLLL3 = C59265NNt.LIZLLL(xpath7, next4, "./Viewable");
            XPath xpath8 = this.LIZLLL;
            o.LJIIIIZZ(xpath8, "xpath");
            C115524g8 c115524g83 = new C115524g8((C115534g9) C59265NNt.LIZIZ(LIZLLL3, xpath8));
            while (c115524g83.hasNext()) {
                Object next5 = c115524g83.next();
                C59255NNj c59255NNj4 = this.LIZ;
                c59255NNj4.viewableSet = C77357UXp.LIZJ(c59255NNj4.viewableSet, next5);
            }
            XPath xpath9 = this.LIZLLL;
            o.LJIIIIZZ(xpath9, "xpath");
            C51652KOy LIZLLL4 = C59265NNt.LIZLLL(xpath9, next4, "./NotViewable");
            XPath xpath10 = this.LIZLLL;
            o.LJIIIIZZ(xpath10, "xpath");
            C115524g8 c115524g84 = new C115524g8((C115534g9) C59265NNt.LIZIZ(LIZLLL4, xpath10));
            while (c115524g84.hasNext()) {
                Object next6 = c115524g84.next();
                C59255NNj c59255NNj5 = this.LIZ;
                c59255NNj5.notViewableSet = C77357UXp.LIZJ(c59255NNj5.notViewableSet, next6);
            }
            XPath xpath11 = this.LIZLLL;
            o.LJIIIIZZ(xpath11, "xpath");
            C51652KOy LIZLLL5 = C59265NNt.LIZLLL(xpath11, next4, "./ViewUndetermined");
            XPath xpath12 = this.LIZLLL;
            o.LJIIIIZZ(xpath12, "xpath");
            C115524g8 c115524g85 = new C115524g8((C115534g9) C59265NNt.LIZIZ(LIZLLL5, xpath12));
            while (c115524g85.hasNext()) {
                Object next7 = c115524g85.next();
                C59255NNj c59255NNj6 = this.LIZ;
                c59255NNj6.viewUndeterminedSet = C77357UXp.LIZJ(c59255NNj6.viewUndeterminedSet, next7);
            }
        }
    }

    public final C59257NNl LJI(Node item) {
        C59257NNl c59257NNl = new C59257NNl();
        XPath xpath = this.LIZLLL;
        o.LJIIIIZZ(xpath, "xpath");
        InterfaceC1039145z LJJJ = OJ6.LJJJ("./ClickThrough", "./IconClickThrough");
        o.LJIIIZ(item, "item");
        c59257NNl.clickThrough = (String) OJ4.LJJJJJ(C59265NNt.LIZIZ(C59265NNt.LIZJ(xpath, item, LJJJ), xpath));
        XPath xpath2 = this.LIZLLL;
        o.LJIIIIZZ(xpath2, "xpath");
        C51652KOy LIZJ = C59265NNt.LIZJ(xpath2, item, OJ6.LJJJ("./ClickTracking", "./IconClickTracking"));
        XPath xpath3 = this.LIZLLL;
        o.LJIIIIZZ(xpath3, "xpath");
        C115524g8 c115524g8 = new C115524g8((C115534g9) C59265NNt.LIZIZ(LIZJ, xpath3));
        while (c115524g8.hasNext()) {
            c59257NNl.clickTracking = C77357UXp.LIZJ(c59257NNl.clickTracking, c115524g8.next());
        }
        return c59257NNl;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #0 {all -> 0x007b, blocks: (B:39:0x0010, B:22:0x004a, B:24:0x004e, B:25:0x0051, B:42:0x0016, B:44:0x001d), top: B:5:0x000e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(int r5, java.lang.String r6) {
        /*
            r4 = this;
            X.NNs r0 = r4.LIZJ
            if (r0 == 0) goto L7
            r0.LJII()
        L7:
            int r0 = r4.LJ
            r1 = 1
            int r0 = r0 + 1
            r4.LJ = r0
            if (r6 == 0) goto L20
            org.w3c.dom.Document r2 = X.C59265NNt.LIZ(r6)     // Catch: X.J82 -> L15 java.lang.Throwable -> L7b
            goto L21
        L15:
            r2 = move-exception
            X.C78983UzD.LJIIZILJ(r2)     // Catch: java.lang.Throwable -> L7b
            X.NNs r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L20
            r0.LIZLLL(r2)     // Catch: java.lang.Throwable -> L7b
        L20:
            r2 = 0
        L21:
            r3 = 0
            if (r2 != 0) goto L4a
            X.NNs r0 = r4.LIZJ
            if (r0 == 0) goto L2b
            r0.LJJJLL()
        L2b:
            int r0 = r4.LJ
            int r0 = r0 + (-1)
            r4.LJ = r0
            if (r0 != 0) goto L49
            X.NNj r0 = r4.LIZ
            java.util.List<X.NNn> r2 = r0.creativeList
            if (r2 == 0) goto L49
            int r0 = r2.size()
            if (r0 <= r1) goto L49
            Y.IDComparatorS38S0000000_10 r1 = new Y.IDComparatorS38S0000000_10
            r0 = 9
            r1.<init>(r0)
            X.C40675Fxn.LJJLIIIJ(r2, r1)
        L49:
            return r3
        L4a:
            X.NNs r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L51
            r0.LJFF()     // Catch: java.lang.Throwable -> L7b
        L51:
            boolean r3 = r4.LJ(r2, r5, r3)     // Catch: java.lang.Throwable -> L7b
            X.NNs r0 = r4.LIZJ
            if (r0 == 0) goto L5c
            r0.LJJJLL()
        L5c:
            int r0 = r4.LJ
            int r0 = r0 + (-1)
            r4.LJ = r0
            if (r0 != 0) goto L7a
            X.NNj r0 = r4.LIZ
            java.util.List<X.NNn> r2 = r0.creativeList
            if (r2 == 0) goto L7a
            int r0 = r2.size()
            if (r0 <= r1) goto L7a
            Y.IDComparatorS38S0000000_10 r1 = new Y.IDComparatorS38S0000000_10
            r0 = 10
            r1.<init>(r0)
            X.C40675Fxn.LJJLIIIJ(r2, r1)
        L7a:
            return r3
        L7b:
            r3 = move-exception
            X.NNs r0 = r4.LIZJ
            if (r0 == 0) goto L83
            r0.LJJJLL()
        L83:
            int r0 = r4.LJ
            int r0 = r0 + (-1)
            r4.LJ = r0
            if (r0 != 0) goto La1
            X.NNj r0 = r4.LIZ
            java.util.List<X.NNn> r2 = r0.creativeList
            if (r2 == 0) goto La1
            int r0 = r2.size()
            if (r0 <= r1) goto La1
            Y.IDComparatorS38S0000000_10 r1 = new Y.IDComparatorS38S0000000_10
            r0 = 11
            r1.<init>(r0)
            X.C40675Fxn.LJJLIIIJ(r2, r1)
        La1:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59262NNq.LIZJ(int, java.lang.String):boolean");
    }

    public final void LIZLLL(Node node, boolean z) {
        boolean z2;
        XPath xpath = this.LIZLLL;
        o.LJIIIIZZ(xpath, "xpath");
        C51651KOx c51651KOx = new C51651KOx(C59265NNt.LIZLLL(xpath, node, "./Creatives/Creative"));
        while (c51651KOx.LIZ()) {
            Object item = c51651KOx.next();
            C59259NNn c59259NNn = new C59259NNn();
            c59259NNn.byWrapper = z;
            String evaluate = this.LIZLLL.evaluate("./@id", item);
            o.LJIIIIZZ(evaluate, "xpath.evaluate(\"./@id\", creativeNode)");
            c59259NNn.id = s.LJZI(evaluate).toString();
            XPath xpath2 = this.LIZLLL;
            o.LJIIIIZZ(xpath2, "xpath");
            o.LJIIIZ(item, "item");
            c59259NNn.duration = (String) OJ4.LJJJJJ(C59265NNt.LIZIZ(C59265NNt.LIZLLL(xpath2, item, "./Linear/Duration"), xpath2));
            XPath xpath3 = this.LIZLLL;
            o.LJIIIIZZ(xpath3, "xpath");
            C51651KOx c51651KOx2 = new C51651KOx(C59265NNt.LIZLLL(xpath3, item, "./Linear/TrackingEvents/Tracking"));
            while (c51651KOx2.LIZ()) {
                Object next = c51651KOx2.next();
                C59261NNp c59261NNp = new C59261NNp();
                String evaluate2 = this.LIZLLL.evaluate("./@event", next);
                o.LJIIIIZZ(evaluate2, "xpath.evaluate(\"./@event\", it)");
                c59261NNp.name = s.LJZI(evaluate2).toString();
                String evaluate3 = this.LIZLLL.evaluate("./@offset", next);
                o.LJIIIIZZ(evaluate3, "xpath.evaluate(\"./@offset\", it)");
                c59261NNp.offset = s.LJZI(evaluate3).toString();
                String evaluate4 = this.LIZLLL.evaluate("./text()", next);
                o.LJIIIIZZ(evaluate4, "xpath.evaluate(\"./text()\", it)");
                c59261NNp.url = s.LJZI(evaluate4).toString();
                c59259NNn.trackingEventList = C77357UXp.LIZIZ(c59261NNp, c59259NNn.trackingEventList);
            }
            XPath xpath4 = this.LIZLLL;
            o.LJIIIIZZ(xpath4, "xpath");
            C110564Vo c110564Vo = new C110564Vo(OJ4.LJJJJLL(C59265NNt.LIZLLL(xpath4, item, "./Linear/VideoClicks"), new C59263NNr(this)));
            while (c110564Vo.hasNext()) {
                c59259NNn.clickList = C77357UXp.LIZIZ(c110564Vo.next(), c59259NNn.clickList);
            }
            XPath xpath5 = this.LIZLLL;
            o.LJIIIIZZ(xpath5, "xpath");
            C51651KOx c51651KOx3 = new C51651KOx(C59265NNt.LIZLLL(xpath5, item, "./Linear/MediaFiles/MediaFile"));
            while (c51651KOx3.LIZ()) {
                Object next2 = c51651KOx3.next();
                C48132Ium c48132Ium = new C48132Ium();
                String evaluate5 = this.LIZLLL.evaluate("./@delivery", next2);
                o.LJIIIIZZ(evaluate5, "xpath.evaluate(\"./@delivery\", mediaFileNode)");
                c48132Ium.delivery = s.LJZI(evaluate5).toString();
                String evaluate6 = this.LIZLLL.evaluate("./@type", next2);
                o.LJIIIIZZ(evaluate6, "xpath.evaluate(\"./@type\", mediaFileNode)");
                c48132Ium.type = s.LJZI(evaluate6).toString();
                String evaluate7 = this.LIZLLL.evaluate("./text()", next2);
                o.LJIIIIZZ(evaluate7, "xpath.evaluate(\"./text()\", mediaFileNode)");
                c48132Ium.url = s.LJZI(evaluate7).toString();
                XPath xpath6 = this.LIZLLL;
                o.LJIIIIZZ(xpath6, "xpath");
                String evaluate8 = xpath6.evaluate("./@bitrate", next2);
                o.LJIIIIZZ(evaluate8, "evaluate(expr, item)");
                Integer LJJIL = C38350F3i.LJJIL(s.LJZI(evaluate8).toString());
                if (LJJIL != null) {
                    c48132Ium.bitRate = LJJIL.intValue();
                }
                XPath xpath7 = this.LIZLLL;
                o.LJIIIIZZ(xpath7, "xpath");
                String evaluate9 = xpath7.evaluate("./@width", next2);
                o.LJIIIIZZ(evaluate9, "evaluate(expr, item)");
                Integer LJJIL2 = C38350F3i.LJJIL(s.LJZI(evaluate9).toString());
                if (LJJIL2 != null) {
                    c48132Ium.width = LJJIL2.intValue();
                }
                XPath xpath8 = this.LIZLLL;
                o.LJIIIIZZ(xpath8, "xpath");
                String evaluate10 = xpath8.evaluate("./@height", next2);
                o.LJIIIIZZ(evaluate10, "evaluate(expr, item)");
                Integer LJJIL3 = C38350F3i.LJJIL(s.LJZI(evaluate10).toString());
                if (LJJIL3 != null) {
                    c48132Ium.height = LJJIL3.intValue();
                }
                XPath xpath9 = this.LIZLLL;
                o.LJIIIIZZ(xpath9, "xpath");
                String evaluate11 = xpath9.evaluate("./@scalable", next2);
                o.LJIIIIZZ(evaluate11, "evaluate(expr, item)");
                String charSequence = s.LJZI(evaluate11).toString();
                if (charSequence.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    c48132Ium.scalable = Boolean.valueOf(ujb.o.LJJJJIZL("true", charSequence, true));
                }
                XPath xpath10 = this.LIZLLL;
                o.LJIIIIZZ(xpath10, "xpath");
                String evaluate12 = xpath10.evaluate("./@maintainAspectRatio", next2);
                o.LJIIIIZZ(evaluate12, "evaluate(expr, item)");
                String charSequence2 = s.LJZI(evaluate12).toString();
                if (charSequence2.length() > 0) {
                    c48132Ium.maintainAspectRatio = Boolean.valueOf(ujb.o.LJJJJIZL("true", charSequence2, true));
                }
                c59259NNn.mediaFileList = C77357UXp.LIZIZ(c48132Ium, c59259NNn.mediaFileList);
            }
            XPath xpath11 = this.LIZLLL;
            o.LJIIIIZZ(xpath11, "xpath");
            C51651KOx c51651KOx4 = new C51651KOx(C59265NNt.LIZLLL(xpath11, item, "./Linear/Icons/Icon"));
            while (c51651KOx4.LIZ()) {
                Object next3 = c51651KOx4.next();
                C59256NNk c59256NNk = new C59256NNk();
                XPath xpath12 = this.LIZLLL;
                o.LJIIIIZZ(xpath12, "xpath");
                String evaluate13 = xpath12.evaluate("./@width", next3);
                o.LJIIIIZZ(evaluate13, "evaluate(expr, item)");
                Integer LJJIL4 = C38350F3i.LJJIL(s.LJZI(evaluate13).toString());
                if (LJJIL4 != null) {
                    c59256NNk.width = LJJIL4.intValue();
                }
                XPath xpath13 = this.LIZLLL;
                o.LJIIIIZZ(xpath13, "xpath");
                String evaluate14 = xpath13.evaluate("./@height", next3);
                o.LJIIIIZZ(evaluate14, "evaluate(expr, item)");
                Integer LJJIL5 = C38350F3i.LJJIL(s.LJZI(evaluate14).toString());
                if (LJJIL5 != null) {
                    c59256NNk.width = LJJIL5.intValue();
                }
                c59256NNk.program = this.LIZLLL.evaluate("./@program", next3);
                XPath xpath14 = this.LIZLLL;
                o.LJIIIIZZ(xpath14, "xpath");
                C51652KOy LIZLLL = C59265NNt.LIZLLL(xpath14, next3, "./StaticResource");
                XPath xpath15 = this.LIZLLL;
                o.LJIIIIZZ(xpath15, "xpath");
                InterfaceC1039145z LIZIZ = C59265NNt.LIZIZ(LIZLLL, xpath15);
                HashSet hashSet = new HashSet();
                OJ4.LJJLI(hashSet, LIZIZ);
                c59256NNk.staticResource = hashSet;
                XPath xpath16 = this.LIZLLL;
                o.LJIIIIZZ(xpath16, "xpath");
                C51652KOy LIZLLL2 = C59265NNt.LIZLLL(xpath16, next3, "./HTMLResource");
                XPath xpath17 = this.LIZLLL;
                o.LJIIIIZZ(xpath17, "xpath");
                c59256NNk.htmlResource = (String) OJ4.LJJJJJ(C59265NNt.LIZIZ(LIZLLL2, xpath17));
                XPath xpath18 = this.LIZLLL;
                o.LJIIIIZZ(xpath18, "xpath");
                C51652KOy LIZLLL3 = C59265NNt.LIZLLL(xpath18, next3, "./IFrameResource");
                XPath xpath19 = this.LIZLLL;
                o.LJIIIIZZ(xpath19, "xpath");
                c59256NNk.iFrameResource = (String) OJ4.LJJJJJ(C59265NNt.LIZIZ(LIZLLL3, xpath19));
                XPath xpath20 = this.LIZLLL;
                o.LJIIIIZZ(xpath20, "xpath");
                C51652KOy LIZLLL4 = C59265NNt.LIZLLL(xpath20, next3, "./IconViewTracking");
                XPath xpath21 = this.LIZLLL;
                o.LJIIIIZZ(xpath21, "xpath");
                InterfaceC1039145z LIZIZ2 = C59265NNt.LIZIZ(LIZLLL4, xpath21);
                HashSet hashSet2 = new HashSet();
                OJ4.LJJLI(hashSet2, LIZIZ2);
                c59256NNk.viewTracking = hashSet2;
                XPath xpath22 = this.LIZLLL;
                o.LJIIIIZZ(xpath22, "xpath");
                C51651KOx c51651KOx5 = new C51651KOx(C59265NNt.LIZLLL(xpath22, next3, "./IconClicks"));
                while (c51651KOx5.LIZ()) {
                    Node node2 = (Node) c51651KOx5.next();
                    c59256NNk.clickList = C77357UXp.LIZIZ(LJI(node2), c59256NNk.clickList);
                }
                c59259NNn.iconList = C77357UXp.LIZIZ(c59256NNk, c59259NNn.iconList);
            }
            if (z) {
                C59255NNj c59255NNj = this.LIZ;
                List<C59259NNn> list = c59255NNj.creativeList;
                if (list == null) {
                    list = new LinkedList<>();
                }
                ListProtector.add(list, 0, c59259NNn);
                c59255NNj.creativeList = list;
            } else {
                C59255NNj c59255NNj2 = this.LIZ;
                c59255NNj2.creativeList = C77357UXp.LIZIZ(c59259NNn, c59255NNj2.creativeList);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #1 {all -> 0x0088, blocks: (B:6:0x000e, B:8:0x0012, B:9:0x0014, B:24:0x0057, B:26:0x005b, B:27:0x005e, B:59:0x001a, B:61:0x001e, B:54:0x0023, B:56:0x002a), top: B:5:0x000e, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(int r5, java.lang.String r6) {
        /*
            r4 = this;
            X.NNs r0 = r4.LIZJ
            if (r0 == 0) goto L7
            r0.LIZIZ()
        L7:
            int r0 = r4.LJ
            r1 = 1
            int r0 = r0 + 1
            r4.LJ = r0
            X.NNw r0 = r4.LIZIZ     // Catch: X.J82 -> L19 X.J81 -> L22 java.lang.Throwable -> L88
            if (r0 != 0) goto L14
            X.NNv r0 = X.C59267NNv.LIZ     // Catch: X.J82 -> L19 X.J81 -> L22 java.lang.Throwable -> L88
        L14:
            org.w3c.dom.Document r2 = r0.LIZ(r6)     // Catch: X.J82 -> L19 X.J81 -> L22 java.lang.Throwable -> L88
            goto L2e
        L19:
            r2 = move-exception
            X.NNs r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L2d
            r0.LIZLLL(r2)     // Catch: java.lang.Throwable -> L88
            goto L2d
        L22:
            r2 = move-exception
            X.C78983UzD.LJIIZILJ(r2)     // Catch: java.lang.Throwable -> L88
            X.NNs r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L2d
            r0.LJI(r2)     // Catch: java.lang.Throwable -> L88
        L2d:
            r2 = 0
        L2e:
            r3 = 0
            if (r2 != 0) goto L57
            X.NNs r0 = r4.LIZJ
            if (r0 == 0) goto L38
            r0.LJJJLL()
        L38:
            int r0 = r4.LJ
            int r0 = r0 + (-1)
            r4.LJ = r0
            if (r0 != 0) goto L56
            X.NNj r0 = r4.LIZ
            java.util.List<X.NNn> r2 = r0.creativeList
            if (r2 == 0) goto L56
            int r0 = r2.size()
            if (r0 <= r1) goto L56
            Y.IDComparatorS38S0000000_10 r1 = new Y.IDComparatorS38S0000000_10
            r0 = 12
            r1.<init>(r0)
            X.C40675Fxn.LJJLIIIJ(r2, r1)
        L56:
            return r3
        L57:
            X.NNs r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L5e
            r0.LJFF()     // Catch: java.lang.Throwable -> L88
        L5e:
            boolean r3 = r4.LJ(r2, r5, r3)     // Catch: java.lang.Throwable -> L88
            X.NNs r0 = r4.LIZJ
            if (r0 == 0) goto L69
            r0.LJJJLL()
        L69:
            int r0 = r4.LJ
            int r0 = r0 + (-1)
            r4.LJ = r0
            if (r0 != 0) goto L87
            X.NNj r0 = r4.LIZ
            java.util.List<X.NNn> r2 = r0.creativeList
            if (r2 == 0) goto L87
            int r0 = r2.size()
            if (r0 <= r1) goto L87
            Y.IDComparatorS38S0000000_10 r1 = new Y.IDComparatorS38S0000000_10
            r0 = 13
            r1.<init>(r0)
            X.C40675Fxn.LJJLIIIJ(r2, r1)
        L87:
            return r3
        L88:
            r3 = move-exception
            X.NNs r0 = r4.LIZJ
            if (r0 == 0) goto L90
            r0.LJJJLL()
        L90:
            int r0 = r4.LJ
            int r0 = r0 + (-1)
            r4.LJ = r0
            if (r0 != 0) goto Lae
            X.NNj r0 = r4.LIZ
            java.util.List<X.NNn> r2 = r0.creativeList
            if (r2 == 0) goto Lae
            int r0 = r2.size()
            if (r0 <= r1) goto Lae
            Y.IDComparatorS38S0000000_10 r1 = new Y.IDComparatorS38S0000000_10
            r0 = 14
            r1.<init>(r0)
            X.C40675Fxn.LJJLIIIJ(r2, r1)
        Lae:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59262NNq.LJFF(int, java.lang.String):boolean");
    }

    public C59262NNq(C59255NNj vast, InterfaceC59268NNw interfaceC59268NNw, InterfaceC59264NNs interfaceC59264NNs) {
        o.LJIIIZ(vast, "vast");
        this.LIZ = vast;
        this.LIZIZ = interfaceC59268NNw;
        this.LIZJ = interfaceC59264NNs;
        this.LIZLLL = XPathFactory.newInstance().newXPath();
    }

    public final boolean LIZ(Node node, int i, int i2) {
        InterfaceC59264NNs interfaceC59264NNs;
        Document LIZ;
        if (i < 0) {
            InterfaceC59264NNs interfaceC59264NNs2 = this.LIZJ;
            if (interfaceC59264NNs2 != null) {
                XPath xpath = this.LIZLLL;
                o.LJIIIIZZ(xpath, "xpath");
                C51652KOy LIZLLL = C59265NNt.LIZLLL(xpath, node, "./VASTAdTagURI");
                XPath xpath2 = this.LIZLLL;
                o.LJIIIIZZ(xpath2, "xpath");
                C115524g8 c115524g8 = new C115524g8((C115534g9) C59265NNt.LIZIZ(LIZLLL, xpath2));
                while (c115524g8.hasNext()) {
                    c115524g8.next();
                    interfaceC59264NNs2.LIZJ();
                }
            }
            return false;
        }
        XPath xpath3 = this.LIZLLL;
        o.LJIIIIZZ(xpath3, "xpath");
        C51652KOy LIZLLL2 = C59265NNt.LIZLLL(xpath3, node, "./VASTAdTagURI");
        XPath xpath4 = this.LIZLLL;
        o.LJIIIIZZ(xpath4, "xpath");
        C115524g8 c115524g82 = new C115524g8((C115534g9) C59265NNt.LIZIZ(LIZLLL2, xpath4));
        boolean z = false;
        while (c115524g82.hasNext()) {
            String str = (String) c115524g82.next();
            InterfaceC59264NNs interfaceC59264NNs3 = this.LIZJ;
            if (interfaceC59264NNs3 != null) {
                interfaceC59264NNs3.LIZIZ();
            }
            try {
                try {
                    try {
                        InterfaceC59268NNw interfaceC59268NNw = this.LIZIZ;
                        if (interfaceC59268NNw == null) {
                            interfaceC59268NNw = C59267NNv.LIZ;
                        }
                        LIZ = interfaceC59268NNw.LIZ(str);
                    } catch (J82 e) {
                        InterfaceC59264NNs interfaceC59264NNs4 = this.LIZJ;
                        if (interfaceC59264NNs4 != null) {
                            interfaceC59264NNs4.LIZLLL(e);
                        }
                    }
                } catch (J81 e2) {
                    C78983UzD.LJIIZILJ(e2);
                    InterfaceC59264NNs interfaceC59264NNs5 = this.LIZJ;
                    if (interfaceC59264NNs5 != null) {
                        interfaceC59264NNs5.LJI(e2);
                    }
                }
                if (LIZ == null) {
                    return false;
                }
                InterfaceC59264NNs interfaceC59264NNs6 = this.LIZJ;
                if (interfaceC59264NNs6 != null) {
                    interfaceC59264NNs6.LJFF();
                }
                if (LJ(LIZ, i, i2 + 1)) {
                    InterfaceC59264NNs interfaceC59264NNs7 = this.LIZJ;
                    if (interfaceC59264NNs7 != null) {
                        interfaceC59264NNs7.LJJJLL();
                    }
                    z = true;
                } else {
                    InterfaceC59264NNs interfaceC59264NNs8 = this.LIZJ;
                    if (interfaceC59264NNs8 != null) {
                        interfaceC59264NNs8.LJJJLL();
                    }
                    return false;
                }
            } finally {
                InterfaceC59264NNs interfaceC59264NNs9 = this.LIZJ;
                if (interfaceC59264NNs9 != null) {
                    interfaceC59264NNs9.LJJJLL();
                }
            }
        }
        if (!z && (interfaceC59264NNs = this.LIZJ) != null) {
            interfaceC59264NNs.LIZLLL(new J82("VASTAdTagURI missing"));
        }
        return z;
    }

    public final boolean LJ(Document document, int i, int i2) {
        int i3 = i - 1;
        String str = this.LIZ.version;
        if (str == null || str.length() == 0) {
            this.LIZ.version = this.LIZLLL.evaluate("/VAST/@version", document);
        }
        XPath xpath = this.LIZLLL;
        o.LJIIIIZZ(xpath, "xpath");
        C51651KOx c51651KOx = new C51651KOx(C59265NNt.LIZLLL(xpath, document, "/VAST/Ad/InLine"));
        while (c51651KOx.LIZ()) {
            Node node = (Node) c51651KOx.next();
            InterfaceC59264NNs interfaceC59264NNs = this.LIZJ;
            if (interfaceC59264NNs != null) {
                interfaceC59264NNs.LIZ();
            }
            String str2 = this.LIZ.adSystem;
            if (str2 == null || str2.length() == 0) {
                C59255NNj c59255NNj = this.LIZ;
                XPath xpath2 = this.LIZLLL;
                o.LJIIIIZZ(xpath2, "xpath");
                C51652KOy LIZLLL = C59265NNt.LIZLLL(xpath2, node, "./AdSystem");
                XPath xpath3 = this.LIZLLL;
                o.LJIIIIZZ(xpath3, "xpath");
                c59255NNj.adSystem = (String) OJ4.LJJJJJ(C59265NNt.LIZIZ(LIZLLL, xpath3));
            }
            String str3 = this.LIZ.adTitle;
            if (str3 == null || str3.length() == 0) {
                C59255NNj c59255NNj2 = this.LIZ;
                XPath xpath4 = this.LIZLLL;
                o.LJIIIIZZ(xpath4, "xpath");
                C51652KOy LIZLLL2 = C59265NNt.LIZLLL(xpath4, node, "./AdTitle");
                XPath xpath5 = this.LIZLLL;
                o.LJIIIIZZ(xpath5, "xpath");
                c59255NNj2.adTitle = (String) OJ4.LJJJJJ(C59265NNt.LIZIZ(LIZLLL2, xpath5));
            }
            String evaluate = this.LIZLLL.evaluate("./Description/text()", node);
            o.LJIIIIZZ(evaluate, "xpath.evaluate(\"./Description/text()\", inLineNode)");
            String charSequence = s.LJZI(evaluate).toString();
            if (charSequence.length() > 0) {
                this.LIZ.description = charSequence;
            }
            LIZLLL(node, false);
            LIZIZ(node);
        }
        XPath xpath6 = this.LIZLLL;
        o.LJIIIIZZ(xpath6, "xpath");
        C51651KOx c51651KOx2 = new C51651KOx(C59265NNt.LIZLLL(xpath6, document, "/VAST/Ad/Wrapper"));
        while (c51651KOx2.LIZ()) {
            Node node2 = (Node) c51651KOx2.next();
            InterfaceC59264NNs interfaceC59264NNs2 = this.LIZJ;
            if (interfaceC59264NNs2 != null) {
                interfaceC59264NNs2.LJ();
            }
            LIZLLL(node2, true);
            LIZIZ(node2);
            if (!LIZ(node2, i3, i2)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ C59262NNq(C59255NNj c59255NNj, InterfaceC59268NNw interfaceC59268NNw, int i) {
        this(c59255NNj, (i & 2) != 0 ? null : interfaceC59268NNw, (InterfaceC59264NNs) null);
    }
}
