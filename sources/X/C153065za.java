package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.google.android.play.core.assetpacks.z;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153065za {
    public C153075zb LIZIZ;
    public final C1548265u LIZJ;
    public final C61995OUt LIZLLL;
    public final InterfaceC153045zY LJ;
    public final z LJFF;
    public InterfaceC153125zg LJI;
    public C66M LJII;
    public StickerHintTextViewModel LJIIIIZZ;
    public final ActivityC45651qj LJIIIZ;
    public AnonymousClass664 LJIILIIL;
    public final List<C153075zb> LIZ = new ArrayList();
    public boolean LJIIJ = true;
    public boolean LJIIJJI = false;
    public int LJIIL = AnonymousClass668.LIZIZ().LIZ();

    public final void LIZIZ() {
        if (this.LIZIZ != null) {
            if (this.LJFF.LJLILLLLZI == null) {
                C122034qd LJJI = C17N.LJJI(this.LJ);
                C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(this.LIZIZ.LJLJI.uuid);
                if (LJJJJLI != null) {
                    StickerItemModel stickerItemModel = this.LIZIZ.LJLJI;
                    LJJJJLI.LIZJ = stickerItemModel.startTime;
                    LJJJJLI.LIZLLL = stickerItemModel.endTime;
                    LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                }
            }
            this.LIZIZ.LJLJJL = false;
            this.LIZIZ = null;
        }
    }

    public final void LJIIL() {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            LJIILIIL((C153075zb) it.next());
        }
    }

    public final void LJIILL() {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            C153075zb c153075zb = (C153075zb) it.next();
            if (this.LJFF.LJLILLLLZI == null) {
                C122034qd LJJI = C17N.LJJI(this.LJ);
                C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(c153075zb.LJLJI.uuid);
                if (LJJJJLI != null) {
                    LJJJJLI.LJII = 0.3137255f;
                    LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                }
            }
        }
    }

    public final boolean LJFF(C153075zb c153075zb) {
        if (this.LJFF.LJLILLLLZI != null || !c153075zb.LJLJI.isPin() || C17N.LJJI(this.LJ).LJIIIIZZ().LIZ().LJ(c153075zb.LJLJI.uuid)) {
            return false;
        }
        return true;
    }

    public final void LJI(C153075zb c153075zb) {
        if (c153075zb == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        z zVar = this.LJFF;
        if (zVar.LJLILLLLZI != null) {
            int id = c153075zb.LJLJI.getId();
            C151065wM c151065wM = (C151065wM) zVar.LJLILLLLZI;
            if (c151065wM != null) {
                c151065wM.LJI(id, true);
            } else {
                InterfaceC153045zY interfaceC153045zY = (InterfaceC153045zY) zVar.LJLIL;
                if (interfaceC153045zY != null) {
                    interfaceC153045zY.removeInfoSticker(id);
                }
            }
            C151065wM c151065wM2 = (C151065wM) this.LJFF.LJLILLLLZI;
            if (c151065wM2 != null) {
                c151065wM2.LJFF = true;
            }
        } else {
            C122034qd LJJI = C17N.LJJI(this.LJ);
            long duration = LJJI.LJIIJJI.V8().getDuration();
            LJJI.LJIIIIZZ().LJIL(c153075zb.LJLJI.uuid);
            if (duration != LJJI.LJIIJJI.V8().getDuration()) {
                atomicBoolean.set(true);
            }
        }
        ((ArrayList) this.LIZ).remove(c153075zb);
        this.LIZIZ = null;
        InterfaceC153125zg interfaceC153125zg = this.LJI;
        if (interfaceC153125zg != null) {
            interfaceC153125zg.LIZ(c153075zb.LJLJI, atomicBoolean.get());
        }
    }

    public final void LJIIJ(C153075zb c153075zb) {
        if (c153075zb != null && !c153075zb.LJLJI.isNowSmallWindowSticker()) {
            StickerItemModel stickerItemModel = c153075zb.LJLJI;
            if (stickerItemModel.layerWeight == C153105ze.LIZIZ) {
                return;
            }
            stickerItemModel.updateLayerWeight(C153105ze.LIZ());
            z zVar = this.LJFF;
            if (zVar.LJLILLLLZI != null) {
                zVar.LIZJ(c153075zb.LJLJI.getId(), c153075zb.LJLJI.layerWeight, true);
            } else {
                C122034qd LJJI = C17N.LJJI(this.LJ);
                C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(c153075zb.LJLJI.uuid);
                if (LJJJJLI != null) {
                    LJJJJLI.LIZIZ = c153075zb.LJLJI.layerWeight;
                    LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                }
            }
            AnonymousClass664 anonymousClass664 = this.LJIILIIL;
            if (anonymousClass664 == null) {
                return;
            }
            anonymousClass664.accept(c153075zb);
        }
    }

    public final void LJIIJJI(int i) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        C153075zb c153075zb = null;
        while (it.hasNext()) {
            C153075zb c153075zb2 = (C153075zb) it.next();
            if (c153075zb2.LJLJI.getId() == i) {
                c153075zb = c153075zb2;
            }
        }
        if (c153075zb == null) {
            return;
        }
        LJI(c153075zb);
    }

    public final void LJIILIIL(C153075zb c153075zb) {
        if (this.LJFF.LJLILLLLZI != null) {
            return;
        }
        C122034qd LJJI = C17N.LJJI(this.LJ);
        C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(c153075zb.LJLJI.uuid);
        if (LJJJJLI != null) {
            LJJJJLI.LJII = 1.0f;
            LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
        }
    }

    public final void LJIILJJIL(C153075zb c153075zb) {
        if (c153075zb != null && ((ArrayList) this.LIZ).contains(c153075zb) && this.LJFF.LJLILLLLZI == null) {
            C122034qd LJJI = C17N.LJJI(this.LJ);
            C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(c153075zb.LJLJI.uuid);
            if (LJJJJLI != null) {
                StickerItemModel stickerItemModel = c153075zb.LJLJI;
                LJJJJLI.LIZJ = stickerItemModel.startTime;
                LJJJJLI.LIZLLL = stickerItemModel.endTime;
                LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
            }
        }
    }

    public final void LJIILLIIL(C153075zb c153075zb) {
        c153075zb.getClass();
        c153075zb.LJLJJL = true;
        this.LIZIZ = c153075zb;
    }

    public final void LJIIZILJ(C153075zb c153075zb) {
        if (c153075zb != null && this.LJFF.LJLILLLLZI == null) {
            C122034qd LJJI = C17N.LJJI(this.LJ);
            C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(c153075zb.LJLJI.uuid);
            if (LJJJJLI != null) {
                LJJJJLI.LIZJ = 0L;
                LJJJJLI.LIZLLL = this.LJ.getDuration();
                LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
            }
        }
    }

    public final void LIZ(InfoStickerModel infoStickerModel, boolean z) {
        C122034qd LJJI;
        int i;
        if (infoStickerModel == null || C32151Nz.LJJIIJZLJL(infoStickerModel.stickers)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
            if (!C1535160t.LIZ(stickerItemModel) && (i = stickerItemModel.layerWeight) != C153105ze.LIZIZ) {
                C153105ze.LIZ = Math.max(i, C153105ze.LIZ);
            }
            if (C1535160t.LIZIZ(stickerItemModel)) {
                if (z) {
                    if (this.LJFF.LJLILLLLZI == null) {
                        if (stickerItemModel.isPin()) {
                            this.LJ.setInfoStickerRestoreMode(1);
                        }
                        if (TextUtils.isEmpty(stickerItemModel.uuid) && !LJIJJ(infoStickerModel.infoStickerDraftDir, stickerItemModel)) {
                            arrayList.add(stickerItemModel);
                        }
                    } else if (!LJIJJ(infoStickerModel.infoStickerDraftDir, stickerItemModel)) {
                        arrayList.add(stickerItemModel);
                    }
                }
                InterfaceC153045zY interfaceC153045zY = this.LJ;
                if (interfaceC153045zY != null && (LJJI = C17N.LJJI(interfaceC153045zY)) != null) {
                    float[] LJIIIZ = LJJI.LJIIIIZZ().LIZ().LJIIIZ(stickerItemModel.uuid);
                    float f = LJIIIZ[2] - LJIIIZ[0];
                    C1548265u c1548265u = this.LIZJ;
                    stickerItemModel.initWidth = f * c1548265u.LJLJI;
                    stickerItemModel.initHeight = (LJIIIZ[1] - LJIIIZ[3]) * c1548265u.LJLJJI;
                }
                C153075zb c153075zb = new C153075zb(this.LIZJ.getContext(), stickerItemModel, this);
                C1548265u c1548265u2 = this.LIZJ;
                c153075zb.LIZIZ(0.5f, 0.5f, c1548265u2.LJLJI, c1548265u2.LJLJJI, c1548265u2.LJLIL, c1548265u2.LJLILLLLZI);
                c153075zb.LIZLLL(stickerItemModel.scale);
                float f2 = stickerItemModel.currentOffsetX - 0.5f;
                C1548265u c1548265u3 = this.LIZJ;
                float f3 = f2 * c1548265u3.LJLJI;
                float f4 = (stickerItemModel.currentOffsetY - 0.5f) * c1548265u3.LJLJJI;
                c153075zb.LJLL.postTranslate(f3, f4);
                c153075zb.LJLJLJ.offset(f3, f4);
                c153075zb.LJLJLLL.offset(f3, f4);
                ((ArrayList) this.LIZ).add(c153075zb);
                if (stickerItemModel.isImageSticker()) {
                    c153075zb.LJLLJ = true;
                }
            }
        }
        if (!C32151Nz.LJJIIZI(arrayList)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("restore info stickers error: ");
        LIZ.append(arrayList.size());
        H7B.LIZJ(X1D.LIZIZ(LIZ));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            StickerItemModel stickerItemModel2 = (StickerItemModel) it.next();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("remove error sticker ");
            LIZ2.append(stickerItemModel2.getId());
            H7B.LIZJ(X1D.LIZIZ(LIZ2));
            infoStickerModel.removeSticker(stickerItemModel2);
        }
    }

    public final void LJIIIIZZ(C153075zb c153075zb, float f) {
        if (f == 0.0f || c153075zb.LJLJI.isNowSmallWindowSticker()) {
            return;
        }
        StickerItemModel stickerItemModel = c153075zb.LJLJI;
        stickerItemModel.rotateAngle += f;
        z zVar = this.LJFF;
        if (zVar.LJLILLLLZI != null) {
            zVar.LJ(-c153075zb.LJLJI.rotateAngle, stickerItemModel.getId(), true);
            C151065wM c151065wM = (C151065wM) this.LJFF.LJLILLLLZI;
            if (c151065wM != null) {
                c151065wM.LJFF = true;
            }
        } else {
            C122034qd LJJI = C17N.LJJI(this.LJ);
            C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(c153075zb.LJLJI.uuid);
            if (LJJJJLI != null) {
                LJJJJLI.LJI = -c153075zb.LJLJI.rotateAngle;
                LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
            }
        }
        c153075zb.LIZJ(f);
    }

    public final void LJIIIZ(C153075zb c153075zb, float f) {
        if (c153075zb.LJLJI.isMusicShareToStorySticker()) {
            if (f < 0.8f || f > 1.6f) {
                if (Build.VERSION.SDK_INT >= 29) {
                    this.LIZLLL.LIZ();
                    return;
                } else {
                    this.LIZLLL.LIZIZ(85, 61);
                    return;
                }
            }
            LJIJ(c153075zb, f, 0.8f, 1.6f);
            return;
        }
        if (c153075zb.LJLJI.isMagnifier()) {
            LJIJ(c153075zb, f, c153075zb.LJLIL, c153075zb.LJLILLLLZI);
        } else {
            LJIJ(c153075zb, f, c153075zb.LJLIL, 2.1474836E9f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x02e9, code lost:
    
        if (r4 != null) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJ(java.lang.String r18, com.ss.android.ugc.aweme.editSticker.model.StickerItemModel r19) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153065za.LJIJJ(java.lang.String, com.ss.android.ugc.aweme.editSticker.model.StickerItemModel):boolean");
    }

    public final OSZ<Float, Float> LIZJ(int i, int i2, int i3) {
        boolean z;
        float[] infoStickerBoundingBox;
        C151325wm LIZIZ;
        z zVar = this.LJFF;
        C151065wM c151065wM = (C151065wM) zVar.LJLILLLLZI;
        if (c151065wM != null && c151065wM.LIZ.LIZIZ() != null) {
            z = true;
        } else {
            z = false;
        }
        float[] fArr = null;
        if (z) {
            C151065wM c151065wM2 = (C151065wM) zVar.LJLILLLLZI;
            if (c151065wM2 == null || (LIZIZ = c151065wM2.LIZ.LIZIZ()) == null || i < 0) {
                return null;
            }
            TEImageInterface tEImageInterface = LIZIZ.LJII;
            if (tEImageInterface != null) {
                fArr = tEImageInterface.getInfoStickerBoundingBoxWithScreenResolution(i, true);
            }
            C151195wZ c151195wZ = new C151195wZ();
            if (fArr != null && fArr[0] >= 0) {
                C151205wa c151205wa = new C151205wa();
                c151205wa.LIZ = fArr[1];
                c151205wa.LIZIZ = fArr[2];
                c151195wZ.LIZ = c151205wa;
                C151205wa c151205wa2 = new C151205wa();
                c151205wa2.LIZ = fArr[3];
                c151205wa2.LIZIZ = fArr[4];
                c151195wZ.LIZIZ = c151205wa2;
                C151205wa c151205wa3 = new C151205wa();
                c151205wa3.LIZ = fArr[5];
                c151205wa3.LIZIZ = fArr[6];
                c151195wZ.LIZLLL = c151205wa3;
                C151205wa c151205wa4 = new C151205wa();
                c151205wa4.LIZ = fArr[7];
                c151205wa4.LIZIZ = fArr[8];
                c151195wZ.LIZJ = c151205wa4;
            }
            return new OSZ<>(Float.valueOf(c151195wZ.LIZLLL.LIZ - c151195wZ.LIZ.LIZ), Float.valueOf(c151195wZ.LIZ.LIZIZ - c151195wZ.LIZIZ.LIZIZ));
        }
        InterfaceC153045zY interfaceC153045zY = (InterfaceC153045zY) zVar.LJLIL;
        if (interfaceC153045zY == null || (infoStickerBoundingBox = interfaceC153045zY.getInfoStickerBoundingBox(i)) == null) {
            return null;
        }
        return new OSZ<>(Float.valueOf((infoStickerBoundingBox[2] - infoStickerBoundingBox[0]) * i2), Float.valueOf((infoStickerBoundingBox[1] - infoStickerBoundingBox[3]) * i3));
    }

    public final void LJII(C153075zb c153075zb, float f, float f2) {
        StickerItemModel stickerItemModel = c153075zb.LJLJI;
        float f3 = stickerItemModel.currentOffsetX;
        C1548265u c1548265u = this.LIZJ;
        stickerItemModel.currentOffsetX = (f / c1548265u.LJLJI) + f3;
        stickerItemModel.currentOffsetY = (f2 / c1548265u.LJLJJI) + stickerItemModel.currentOffsetY;
        z zVar = this.LJFF;
        if (zVar.LJLILLLLZI != null) {
            int id = stickerItemModel.getId();
            StickerItemModel stickerItemModel2 = c153075zb.LJLJI;
            zVar.LIZLLL(id, stickerItemModel2.currentOffsetX, stickerItemModel2.currentOffsetY, f, f2, true, false);
            C151065wM c151065wM = (C151065wM) this.LJFF.LJLILLLLZI;
            if (c151065wM != null) {
                c151065wM.LJFF = true;
            }
        } else {
            C5WG LJIIIIZZ = C17N.LJJI(this.LJ).LJIIIIZZ();
            StickerItemModel stickerItemModel3 = c153075zb.LJLJI;
            LJIIIIZZ.LJIIL(Float.valueOf(stickerItemModel3.currentOffsetX), Float.valueOf(c153075zb.LJLJI.currentOffsetY), stickerItemModel3.uuid);
        }
        c153075zb.LJLL.postTranslate(f, f2);
        c153075zb.LJLJLJ.offset(f, f2);
        c153075zb.LJLJLLL.offset(f, f2);
    }

    public final void LJIJI(C153075zb c153075zb, int i, int i2) {
        int i3;
        int i4;
        if (c153075zb != null) {
            StickerItemModel stickerItemModel = c153075zb.LJLJI;
            stickerItemModel.startTime = i;
            stickerItemModel.endTime = i2;
            InterfaceC153045zY interfaceC153045zY = this.LJ;
            if (interfaceC153045zY != null) {
                i3 = interfaceC153045zY.LLJJI(i);
            } else {
                i3 = i;
            }
            InterfaceC153045zY interfaceC153045zY2 = this.LJ;
            if (interfaceC153045zY2 != null) {
                i4 = interfaceC153045zY2.LLJJI(i2);
            } else {
                i4 = i2;
            }
            StickerItemModel stickerItemModel2 = c153075zb.LJLJI;
            stickerItemModel2.uiStartTime = i3;
            stickerItemModel2.uiEndTime = i4;
            if (this.LJFF.LJLILLLLZI == null) {
                C122034qd LJJI = C17N.LJJI(this.LJ);
                C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(c153075zb.LJLJI.uuid);
                if (LJJJJLI != null) {
                    LJJJJLI.LIZJ = i;
                    LJJJJLI.LIZLLL = i2;
                    LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                }
            }
        }
    }

    public C153065za(ActivityC45651qj activityC45651qj, C1548265u c1548265u, InterfaceC153045zY interfaceC153045zY, View view) {
        this.LIZJ = c1548265u;
        this.LJ = interfaceC153045zY;
        this.LJIIIZ = activityC45651qj;
        if (interfaceC153045zY != null) {
            interfaceC153045zY.getDuration();
        }
        this.LIZLLL = new C61995OUt(c1548265u.getContext());
        this.LJFF = new z(interfaceC153045zY);
        this.LJIIIIZZ = (StickerHintTextViewModel) C165706es.LIZLLL(view).get(StickerHintTextViewModel.class);
    }

    public final void LJIJ(C153075zb c153075zb, float f, float f2, float f3) {
        StickerItemModel stickerItemModel = c153075zb.LJLJI;
        float f4 = stickerItemModel.scale * f;
        if (f4 < f2 && f < 1.0f) {
            return;
        }
        if ((f4 > f3 && f > 1.0f) || stickerItemModel.isNowSmallWindowSticker()) {
            return;
        }
        z zVar = this.LJFF;
        if (zVar.LJLILLLLZI != null) {
            zVar.LJFF(f, c153075zb.LJLJI.getId(), true);
        } else {
            C122034qd LJJI = C17N.LJJI(this.LJ);
            C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(c153075zb.LJLJI.uuid);
            if (LJJJJLI != null) {
                LJJJJLI.LJIIIIZZ *= f;
                LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
            }
        }
        c153075zb.LJLJI.scale = f4;
        c153075zb.LIZLLL(f);
    }

    public final C153075zb LIZLLL(int i, int i2, String str, String str2, String str3, String str4) {
        return LJ(str, str2, str3, i, i2, str4, 0.0f, 0.0f, 1.0f, 1.0f, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0224  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C153075zb LJ(java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35, int r36, java.lang.String r37, float r38, float r39, float r40, float r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153065za.LJ(java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, float, float, float, float, boolean):X.5zb");
    }
}
