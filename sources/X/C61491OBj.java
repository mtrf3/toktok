package X;

import Y.ARunnableS47S0100000_11;
import a04.IDfS0S0100000_11;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.g;
import com.google.gson.j;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TypefaceStyle;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import defpackage.i0;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.OBj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61491OBj implements IPoiAnchorService, InterfaceC07710Rz, InterfaceC60252Nkm, InterfaceC86629XzF {
    public static boolean LJLIL = false;
    public static C0S4 LJLILLLLZI = null;
    public static int LJLJI = 10;
    public static int LJLJJI = -1;
    public static int LJLJJL = 8;
    public static int LJLJJLL = 1500000;
    public static int LJLJL = 2000000;
    public static List LJLJLJ;

    @Override // X.InterfaceC86629XzF
    public boolean LJFF(String channel) {
        o.LJIIJ(channel, "channel");
        return false;
    }

    @Override // X.InterfaceC60252Nkm
    public void LJJI() {
    }

    @Override // X.InterfaceC60252Nkm
    public void LJJJJJL() {
    }

    @Override // X.InterfaceC86629XzF
    public void LJJLIIIJJIZ(java.util.Map map) {
    }

    public void LJL(String schema, String biz, C60737Nsb c60737Nsb, C30941Ji c30941Ji) {
        o.LJIIJ(schema, "schema");
        o.LJIIJ(biz, "biz");
    }

    public void LJLI(String schema, String biz, C60737Nsb c60737Nsb, InterfaceC60833Nu9 interfaceC60833Nu9) {
        o.LJIIJ(schema, "schema");
        o.LJIIJ(biz, "biz");
    }

    public static void LJJLL() {
        int i = LJLJJI;
        if (i != -1) {
            C0S4 c0s4 = LJLILLLLZI;
            c0s4.getClass();
            try {
                Method method = C0S4.LJII;
                if (method != null) {
                    C0S4.LIZJ(c0s4.LIZ, method, new Object[]{Integer.valueOf(i)});
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("invoke userDisable with handle ");
                    LIZ.append(i);
                    X1D.LIZIZ(LIZ);
                    C0YN.LIZ(4);
                }
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Exception ");
                LIZ2.append(e);
                X1D.LIZIZ(LIZ2);
                C0YN.LIZ(6);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("userDisableIfNeed  sCurPerfHandle = ");
            LIZ3.append(LJLJJI);
            X1D.LIZIZ(LIZ3);
            C0YN.LIZ(3);
        }
    }

    public static void LJLIIIL() {
        j jVar = (j) i0.LJ(true, "coldboot_satellitemethod", 31744, g.class, null);
        if (jVar != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeStringSet("coldboot_satellitemethod", new HashSet((Collection) C75792yF.LIZ(jVar.toString(), List.class)));
        } else {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeStringSet("coldboot_satellitemethod", new HashSet());
        }
    }

    @Override // X.InterfaceC07710Rz
    public void a() {
        LJJLL();
        C0S4 c0s4 = LJLILLLLZI;
        if (c0s4 != null) {
            int LIZLLL = c0s4.LIZLLL();
            LJLJJI = LIZLLL;
            if (-1 != LIZLLL) {
                C0YN.LIZ(3);
                LJLILLLLZI.LIZIZ(LJLJJI, 10, 3, -1);
                LJLILLLLZI.LIZIZ(LJLJJI, 1, LJLJJL, -1);
                LJLILLLLZI.LIZIZ(LJLJJI, 4, LJLJL, -1);
                LJLILLLLZI.LIZIZ(LJLJJI, 6, LJLJL, LJLJJLL);
                LJLILLLLZI.LIZIZ(LJLJJI, 23, 1000, -1);
                LJLILLLLZI.LIZ(LJLJJI, 30000);
            }
        }
    }

    @Override // X.InterfaceC07710Rz
    public void b() {
        LJJLL();
        C0YN.LIZ(3);
    }

    public static ARunnableS47S0100000_11 LJJZZIII(Context context) {
        IDfS0S0100000_11 iDfS0S0100000_11 = new IDfS0S0100000_11(context, 1);
        synchronized (UCH.class) {
            if (!UCH.LJLIL) {
                UCH.LJLIL = true;
                UCH.LJFF(iDfS0S0100000_11);
                return new ARunnableS47S0100000_11(iDfS0S0100000_11, 103);
            }
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0036. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJLIIL(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = 0
            if (r6 != 0) goto L4
        L3:
            return r5
        L4:
            boolean r0 = r6.isAd()
            if (r0 == 0) goto L3
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r6.getAwemeRawAd()
            if (r4 != 0) goto L11
            goto L3
        L11:
            boolean r0 = r4.isDisableUserprofileAdLabel()
            if (r0 == 0) goto L18
            goto L3
        L18:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            java.lang.String r3 = r0.getType()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L27
            goto L3
        L27:
            java.lang.String r2 = r4.getOpenUrl()
            java.lang.String r1 = r4.getWebUrl()
            r3.getClass()
            int r0 = r3.hashCode()
            switch(r0) {
                case -1354573786: goto Lbd;
                case 96801: goto Lb3;
                case 117588: goto La9;
                case 3148996: goto L80;
                case 106642798: goto L6e;
                case 954925063: goto L60;
                case 957829685: goto L4d;
                case 1893962841: goto L3a;
                default: goto L39;
            }
        L39:
            goto L3
        L3a:
            java.lang.String r0 = "redpacket"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L43
            goto L3
        L43:
            java.lang.String r0 = r4.getRedUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            goto Le9
        L4d:
            java.lang.String r0 = "counsel"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L56
            goto L3
        L56:
            java.lang.String r0 = r4.getConsultUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            goto Le9
        L60:
            java.lang.String r0 = "message"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L69
            goto L3
        L69:
            boolean r0 = X.C63081OpJ.LLD(r6)
            goto Le9
        L6e:
            java.lang.String r0 = "phone"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L77
            goto L3
        L77:
            java.lang.String r0 = r4.getPhoneNumber()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            goto Le9
        L80:
            java.lang.String r0 = "form"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L8a
            goto L3
        L8a:
            java.lang.String r0 = r4.getFormUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le2
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L3
            java.util.Map r1 = r0.getCardInfos()
            if (r1 == 0) goto L3
            java.lang.String r0 = "5"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L3
            goto Le2
        La9:
            java.lang.String r0 = "web"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lc7
            goto L3
        Lb3:
            java.lang.String r0 = "app"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Ld4
            goto L3
        Lbd:
            java.lang.String r0 = "coupon"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lc7
            goto L3
        Lc7:
            boolean r0 = X.NPC.LJI(r2)
            if (r0 != 0) goto Le2
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L3
            goto Le2
        Ld4:
            java.lang.String r0 = r4.getOpenUrl()
            java.lang.String r1 = r4.getPackageName()
            boolean r0 = X.NPC.LJI(r0)
            if (r0 == 0) goto Le5
        Le2:
            r5 = 1
            goto L3
        Le5:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
        Le9:
            r0 = r0 ^ 1
            if (r0 == 0) goto L3
            goto Le2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61491OBj.LJLIIL(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static final TemplateData LJLIL(OSZ... data) {
        o.LJIIIZ(data, "data");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (OSZ osz : data) {
            Object second = osz.getSecond();
            if (second != null) {
                linkedHashMap.put(osz.getFirst(), second);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return TemplateData.LJFF(C27739Aud.LJI(linkedHashMap));
    }

    @Override // X.InterfaceC07710Rz
    public boolean LJIIZILJ(Context context) {
        if (LJLILLLLZI == null) {
            C0S4 c0s4 = new C0S4(context);
            LJLILLLLZI = c0s4;
            if (C0S4.LIZIZ) {
                c0s4.LJ(0);
                LJLJI = LJLILLLLZI.LJ(3);
                int LIZLLL = LJLILLLLZI.LIZLLL();
                LJLJJI = LIZLLL;
                if (LIZLLL == -1) {
                    C0YN.LIZ(5);
                    return false;
                }
                int availableProcessors = Runtime.getRuntime().availableProcessors();
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/possible", "r");
                    String readLine = randomAccessFile.readLine();
                    randomAccessFile.close();
                    if (readLine != null) {
                        String[] split = readLine.split("-");
                        if (split.length == 2) {
                            availableProcessors = CastIntegerProtector.parseInt(split[1]) + 1;
                        }
                    }
                } catch (IOException | NumberFormatException e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (availableProcessors <= 0) {
                    availableProcessors = 8;
                }
                LJLJJL = availableProcessors;
                LJLJJLL = C0S3.LIZ(0);
                LJLJL = C0S3.LIZ(6);
                C0YN.LIZ(4);
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC07710Rz
    public void LJJL(long j) {
        LJJLL();
        C0S4 c0s4 = LJLILLLLZI;
        if (c0s4 != null) {
            int LIZLLL = c0s4.LIZLLL();
            LJLJJI = LIZLLL;
            if (-1 != LIZLLL) {
                C0YN.LIZ(3);
                LJLILLLLZI.LIZIZ(LJLJJI, 10, 3, -1);
                LJLILLLLZI.LIZIZ(LJLJJI, 8, LJLJI, -1);
                LJLILLLLZI.LIZ(LJLJJI, (int) j);
            }
        }
    }

    @Override // X.InterfaceC07710Rz
    public void LJJLIIIJL(long j) {
        LJJLL();
        C0S4 c0s4 = LJLILLLLZI;
        if (c0s4 != null) {
            int LIZLLL = c0s4.LIZLLL();
            LJLJJI = LIZLLL;
            if (-1 != LIZLLL) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("try boost timeout ");
                LIZ.append(j);
                X1D.LIZIZ(LIZ);
                C0YN.LIZ(3);
                LJLILLLLZI.LIZIZ(LJLJJI, 10, 3, -1);
                LJLILLLLZI.LIZIZ(LJLJJI, 1, LJLJJL, -1);
                LJLILLLLZI.LIZIZ(LJLJJI, 4, LJLJL, -1);
                LJLILLLLZI.LIZIZ(LJLJJI, 6, LJLJL, LJLJJLL);
                LJLILLLLZI.LIZIZ(LJLJJI, 23, 1000, -1);
                LJLILLLLZI.LIZ(LJLJJI, (int) j);
            }
        }
    }

    @Override // X.InterfaceC07710Rz
    public void LJJLIIIJLLLLLLLZ(long j) {
        LJJLL();
        C0S4 c0s4 = LJLILLLLZI;
        if (c0s4 != null) {
            int LIZLLL = c0s4.LIZLLL();
            LJLJJI = LIZLLL;
            if (-1 != LIZLLL) {
                C0YN.LIZ(3);
                LJLILLLLZI.LIZIZ(LJLJJI, 10, 3, -1);
                LJLILLLLZI.LIZ(LJLJJI, (int) j);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public boolean shouldShowCustomFeedSingleAnchor(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors == null || anchors.size() <= 0 || ((AnchorCommonStruct) ListProtector.get(aweme.getAnchors(), 0)).getType() != EnumC42934Gt8.POI.getTYPE() || HG3.LJIILL().isMe(aweme.getAuthorUid()) || aweme.getPoiDataStruct() == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public boolean shouldShowOldFeedSingleAnchor(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors == null || anchors.size() <= 0 || ((AnchorCommonStruct) ListProtector.get(aweme.getAnchors(), 0)).getType() != EnumC42934Gt8.POI.getTYPE()) {
            return false;
        }
        return true;
    }

    public static void LJJZZI(NLEStyText nLEStyText, TextStickerData textStickerData) {
        int i = 2;
        if (textStickerData.getBgMode() == 2 || textStickerData.getBgMode() == 3) {
            NLEEditorJniJNI.NLEStyText_setBackground(nLEStyText.LIZ, nLEStyText, true);
        } else {
            NLEEditorJniJNI.NLEStyText_setTextColor(nLEStyText.LIZ, nLEStyText, textStickerData.getColor());
        }
        if (textStickerData.getBgMode() == 2) {
            NLEEditorJniJNI.NLEStyText_setBackgroundColor(nLEStyText.LIZ, nLEStyText, textStickerData.getColor());
            if (textStickerData.getColor() == -1) {
                NLEEditorJniJNI.NLEStyText_setTextColor(nLEStyText.LIZ, nLEStyText, -16777216L);
            } else {
                NLEEditorJniJNI.NLEStyText_setTextColor(nLEStyText.LIZ, nLEStyText, -1L);
            }
        } else if (textStickerData.getBgMode() == 3) {
            NLEEditorJniJNI.NLEStyText_setBackgroundColor(nLEStyText.LIZ, nLEStyText, C1551767d.LJIILIIL(textStickerData.getColor()));
            NLEEditorJniJNI.NLEStyText_setTextColor(nLEStyText.LIZ, nLEStyText, -1L);
        }
        if (textStickerData.getBgMode() == 4) {
            NLEEditorJniJNI.NLEStyText_setOutline(nLEStyText.LIZ, nLEStyText, true);
            NLEEditorJniJNI.NLEStyText_setOutlineColor(nLEStyText.LIZ, nLEStyText, C1553767x.LIZ(textStickerData.getColor()));
            NLEEditorJniJNI.NLEStyText_setOutlineWidth(nLEStyText.LIZ, nLEStyText, 0.14285715f);
        } else {
            NLEEditorJniJNI.NLEStyText_setOutline(nLEStyText.LIZ, nLEStyText, false);
        }
        int align = textStickerData.getAlign();
        if (align != 1) {
            if (align != 3) {
                i = 1;
            }
        } else {
            i = 0;
        }
        NLEEditorJniJNI.NLEStyText_setAlignType(nLEStyText.LIZ, nLEStyText, i);
        NLEEditorJniJNI.NLEStyText_setFontSize(nLEStyText.LIZ, nLEStyText, (textStickerData.getFontSize() * 72) / 300);
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        NLEEditorJniJNI.NLEStyText_setFont(nLEStyText.LIZ, nLEStyText, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
        if (C78685UuP.LJJJZ(textStickerData.getFontResId())) {
            nLEStyText.LIZIZ().LJIIJ(C134305Ow.LIZ(textStickerData.getFontResId(), "textfont"));
            nLEStyText.LIZIZ().setExtra("biz_res_id", nLEStyText.LIZIZ().LIZLLL());
        }
        if (!textStickerData.getInlineTextStyles().isEmpty()) {
            List<InlineRichTextStyleData> inlineTextStyles = textStickerData.getInlineTextStyles();
            ArrayList arrayList = new ArrayList();
            for (InlineRichTextStyleData inlineRichTextStyleData : inlineTextStyles) {
                if (inlineRichTextStyleData.inlineStyle instanceof TypefaceStyle) {
                    arrayList.add(inlineRichTextStyleData);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InlineRichTextStyleData) it.next()).inlineStyle);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                InlineRichTextStyle inlineRichTextStyle = (InlineRichTextStyle) it2.next();
                o.LJII(inlineRichTextStyle, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.bean.TypefaceStyle");
                ((TypefaceStyle) inlineRichTextStyle).fontResId = C134305Ow.LIZ(textStickerData.getFontResId(), "textfont");
            }
            nLEStyText.setExtra("biz_inline_text_style", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textStickerData.getInlineTextStyles()));
        }
    }

    @Override // X.InterfaceC86629XzF
    public JSONObject LIZJ(String channel, byte[] bArr, String dataMessage) {
        o.LJIIJ(channel, "channel");
        o.LJIIJ(dataMessage, "dataMessage");
        return new JSONObject();
    }

    public static void LJJZ(View view, int i, int i2, boolean z) {
        if (view == null) {
            return;
        }
        int i3 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
        if (z) {
            if (i3 >= 0) {
                return;
            }
            KP0.LIZIZ(view, i3, i, i2).start();
        } else {
            if (i3 < 0) {
                return;
            }
            KP0.LIZIZ(view, i3, i, i2).start();
        }
    }
}
