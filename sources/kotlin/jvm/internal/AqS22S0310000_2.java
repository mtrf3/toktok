package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C00F;
import X.C121594pv;
import X.C122034qd;
import X.C1300758p;
import X.C1303959v;
import X.C131935Ft;
import X.C138845ce;
import X.C147295qH;
import X.C170666ms;
import X.C17N;
import X.C39579Fg7;
import X.C58D;
import X.C5L7;
import X.C76800UCe;
import X.C78983UzD;
import X.InterfaceC1299658e;
import X.InterfaceC142865j8;
import X.InterfaceC153045zY;
import X.InterfaceC65784Pro;
import X.X1D;
import Y.ARunnableS2S0310000_2;
import android.graphics.BitmapFactory;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.ss.ugc.android.editor.track.SeekInfo;
import com.ss.ugc.android.editor.track.TrackPanelActionListener;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AqS22S0310000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS22S0310000_2 aqS22S0310000_2) {
        boolean z = !aqS22S0310000_2.z3;
        C147295qH c147295qH = (C147295qH) aqS22S0310000_2.l0;
        SceneExtensionsKt.LIZJ(c147295qH, new ARunnableS2S0310000_2(c147295qH, (Runnable) aqS22S0310000_2.l1, (Runnable) aqS22S0310000_2.l2, z, 1), C00F.LIZ(31744, 16, "creative_tools_cover_delay_time_experiment", true));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS22S0310000_2 aqS22S0310000_2) {
        List<StickerItemModel> list;
        String str;
        String LIZIZ;
        ((InterfaceC142865j8) aqS22S0310000_2.l0).LIZIZ();
        if (aqS22S0310000_2.z3) {
            List list2 = (List) aqS22S0310000_2.l1;
            C147295qH c147295qH = (C147295qH) aqS22S0310000_2.l2;
            VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
            C122034qd c122034qd = null;
            if (videoPublishEditModel != null) {
                InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
                InterfaceC153045zY LLLIZZ = c147295qH.LLLIZZ();
                ArrayList arrayList = new ArrayList();
                if (LLLIZZ != null) {
                    c122034qd = C17N.LJJI(LLLIZZ);
                }
                if (infoStickerModel != null && (list = infoStickerModel.stickers) != null && !list.isEmpty() && LLLIZZ != null && C78983UzD.LJJJJIZL(LLLIZZ) && c122034qd != null) {
                    for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                        if (!C138845ce.LIZ() || !stickerItemModel.isTextSticker()) {
                            if (stickerItemModel.isImageStickerLayer && (str = stickerItemModel.path) != null) {
                                if (C39579Fg7.LIZIZ(str)) {
                                    LIZIZ = stickerItemModel.path;
                                } else {
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append(infoStickerModel.infoStickerDraftDir);
                                    LIZ.append(File.separator);
                                    LIZ.append(new File(stickerItemModel.path).getName());
                                    LIZIZ = X1D.LIZIZ(LIZ);
                                }
                                if (!C39579Fg7.LIZIZ(LIZIZ)) {
                                    C5L7.LIZIZ();
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("infoSticker not exist ");
                                    LIZ2.append(stickerItemModel);
                                    C170666ms.LIZJ(new Exception(X1D.LIZIZ(LIZ2)));
                                } else {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeFile(LIZIZ, options);
                                    float f = (options.outHeight * 1.0f) / options.outWidth;
                                    C121594pv c121594pv = new C121594pv(0);
                                    c121594pv.LJIIL = LIZIZ;
                                    float f2 = stickerItemModel.w;
                                    c121594pv.LJIILIIL = f2;
                                    c121594pv.LJIILJJIL = c122034qd.LJIIJ.LJ().getCanvasRatio() * f2 * f;
                                    c121594pv.LJ = stickerItemModel.currentOffsetX;
                                    c121594pv.LJFF = stickerItemModel.currentOffsetY;
                                    c121594pv.LJIIIIZZ = stickerItemModel.scale;
                                    c121594pv.LJI = stickerItemModel.rotateAngle;
                                    c121594pv.LIZJ = stickerItemModel.startTime;
                                    c121594pv.LIZLLL = stickerItemModel.endTime;
                                    c121594pv.LIZIZ = stickerItemModel.layerWeight;
                                    c122034qd.LJIIIIZZ().LJJJJIZL(c121594pv);
                                    String str2 = c121594pv.LIZ;
                                    if (str2 != null) {
                                        arrayList.add(str2);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                            }
                        }
                    }
                }
                list2.addAll(arrayList);
            } else {
                o.LJIJI("mModel");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS22S0310000_2 aqS22S0310000_2) {
        String str = ((C58D) aqS22S0310000_2.l0).TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updatePlayState ");
        LIZ.append((PlayPositionState) aqS22S0310000_2.l1);
        LIZ.append(' ');
        C131935Ft.LIZIZ(str, X1D.LIZIZ(LIZ));
        final long position = ((PlayPositionState) aqS22S0310000_2.l1).getPosition() / 1000;
        int LIZIZ = (int) (C1300758p.LIZIZ() * ((float) position));
        if (Math.abs(((C58D) aqS22S0310000_2.l0)._$_findCachedViewById(R.id.dmw).getScrollX()) == LIZIZ) {
            ((InterfaceC65784Pro) aqS22S0310000_2.l2).invoke();
        } else {
            ((C58D) aqS22S0310000_2.l0).disableOnTouchScroller(true);
            C1303959v c1303959v = (C1303959v) ((C58D) aqS22S0310000_2.l0)._$_findCachedViewById(R.id.jca);
            if (((C58D) aqS22S0310000_2.l0).isRTL()) {
                LIZIZ = -LIZIZ;
            }
            c1303959v.LJJJJJ(LIZIZ - ((C58D) aqS22S0310000_2.l0)._$_findCachedViewById(R.id.dmw).getScrollX(), false);
            C1303959v c1303959v2 = (C1303959v) ((C58D) aqS22S0310000_2.l0)._$_findCachedViewById(R.id.jca);
            final C58D c58d = (C58D) aqS22S0310000_2.l0;
            final boolean z = aqS22S0310000_2.z3;
            final InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS22S0310000_2.l2;
            c1303959v2.LJLLI.add(new InterfaceC1299658e() { // from class: X.58I
                @Override // X.InterfaceC1299658e
                public final void LIZ(C5AF state, int i) {
                    o.LJIIIZ(state, "state");
                    if (state == C5AF.IDLE) {
                        C1303959v c1303959v3 = (C1303959v) C58D.this._$_findCachedViewById(R.id.jca);
                        c1303959v3.getClass();
                        c1303959v3.LJLLI.remove(this);
                        C58D c58d2 = C58D.this;
                        c58d2.timestamp = position;
                        TrackPanelActionListener trackPanelActionListener = c58d2.getTrackPanelActionListener();
                        if (trackPanelActionListener != null) {
                            trackPanelActionListener.onVideoPositionChanged(new SeekInfo(C58D.this.timestamp * 1000, false, 0, 0.0f, 0.0f, z, false, 94, null));
                        }
                        C58Q innerListener = C58D.this.getInnerListener();
                        if (innerListener != null) {
                            innerListener.LIZIZ(C58D.this.timestamp);
                        }
                        interfaceC65784Pro.invoke();
                        C58D.this.disableOnTouchScroller(false);
                    }
                }
            });
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS22S0310000_2(C58D c58d, C58D c58d2, PlayPositionState playPositionState, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = c58d;
        this.l1 = c58d2;
        this.l2 = playPositionState;
        this.z3 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS22S0310000_2(InterfaceC142865j8 interfaceC142865j8, C147295qH c147295qH, List list, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC142865j8;
        this.z3 = z;
        this.l1 = list;
        this.l2 = c147295qH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS22S0310000_2(C147295qH c147295qH, Runnable runnable, Runnable runnable2, boolean z, int i) {
        super(0);
        this.$t = i;
        this.z3 = z;
        this.l0 = c147295qH;
        this.l1 = runnable;
        this.l2 = runnable2;
    }
}
