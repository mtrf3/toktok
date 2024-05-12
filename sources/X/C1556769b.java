package X;

import Y.ARunnableS21S0200000_2;
import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.PointF;
import android.os.SystemClock;
import android.widget.FrameLayout;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerState;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.69b */
/* loaded from: classes3.dex */
public final class C1556769b extends C6BL {
    public C67E LLI;
    public final C62822Ol8 LLIFFJFJJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 865));
    public String LLII;
    public VideoPublishEditModel LLIIII;

    @Override // X.C6BL
    public final int LJIIJ() {
        return R.string.e3o;
    }

    @Override // X.C6BL
    public final int LJIILIIL() {
        return 6;
    }

    @Override // X.C6BL
    public final void LJJII() {
        this.LLI = null;
        super.LJJII();
    }

    @Override // X.C6BL
    public final boolean LJIILLIIL() {
        if (this.LLI != null) {
            return true;
        }
        return false;
    }

    @Override // X.C6BL
    public final boolean LJIJJLI() {
        BaseJediViewModel baseJediViewModel = (BaseJediViewModel) this.LLIFFJFJJ.getValue();
        Context context = this.LJZL;
        o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return ((EditDonationStickerState) baseJediViewModel.Hv0((C1AU) context)).getInTimeEditView();
    }

    public static final String LJJIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pi_start");
        LIZ.append(UUID.randomUUID());
        LIZ.append("pi_end");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC156096Ar
    public final InteractStickerStruct getInteractStickerStruct() {
        float f;
        String str;
        String str2;
        String str3;
        String str4;
        C6J6 c6j6;
        String orgType;
        C6J6 c6j62;
        C6J6 c6j63;
        C6J6 c6j64;
        C6J6 c6j65;
        if (!LJIILLIIL() || this.LJLL == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(6);
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setRotation(C6BL.LJIILJJIL(this.LJLL.getRotateAngle()));
        normalTrackTimeStamp.setScale(Float.valueOf(this.LJLL.getScale()));
        PointF LIZIZ = LIZIZ(this.LJLL.getCenterViewPoint());
        normalTrackTimeStamp.setX(LIZIZ.x);
        normalTrackTimeStamp.setY(LIZIZ.y);
        C156426By c156426By = this.LJLL;
        if (!(c156426By instanceof C1557269g)) {
            c156426By = null;
        }
        float f2 = 0.0f;
        if (c156426By != null) {
            f = c156426By.getStartTime();
        } else {
            f = 0.0f;
        }
        normalTrackTimeStamp.setStartTime(f);
        C156426By c156426By2 = this.LJLL;
        if ((c156426By2 instanceof C1557269g) && c156426By2 != null) {
            f2 = c156426By2.getEndTime();
        }
        normalTrackTimeStamp.setEndTime(f2);
        PointF LIZIZ2 = LIZIZ(new PointF(this.LJLL.getContentViewWidth(), this.LJLL.getContentViewHeight()));
        normalTrackTimeStamp.setWidth(LIZIZ2.x);
        normalTrackTimeStamp.setHeight(LIZIZ2.y);
        linkedList.add(normalTrackTimeStamp);
        C78609UtB.LJJJLZIJ(interactStickerStruct, linkedList);
        OSZ[] oszArr = new OSZ[5];
        C67E c67e = this.LLI;
        String str5 = "";
        if (c67e == null || (c6j65 = c67e.LJLIL) == null || (str = c6j65.getName()) == null) {
            str = "";
        }
        oszArr[0] = new OSZ("donation_name", str);
        C67E c67e2 = this.LLI;
        if (c67e2 == null || (c6j64 = c67e2.LJLIL) == null || (str2 = c6j64.getDonateLink()) == null) {
            str2 = "";
        }
        oszArr[1] = new OSZ("donation_url", str2);
        C67E c67e3 = this.LLI;
        if (c67e3 == null || (c6j63 = c67e3.LJLIL) == null || (str3 = c6j63.getAddTime()) == null) {
            str3 = "";
        }
        oszArr[2] = new OSZ("add_anchor_time", str3);
        C67E c67e4 = this.LLI;
        if (c67e4 == null || (c6j62 = c67e4.LJLIL) == null || (str4 = c6j62.getOrgId()) == null) {
            str4 = "";
        }
        oszArr[3] = new OSZ("organization_id", str4);
        C67E c67e5 = this.LLI;
        if (c67e5 != null && (c6j6 = c67e5.LJLIL) != null && (orgType = c6j6.getOrgType()) != null) {
            str5 = orgType;
        }
        oszArr[4] = new OSZ("organization_type", str5);
        interactStickerStruct.setAttr(GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), C113554cx.LJJJLZIJ(oszArr)));
        return interactStickerStruct;
    }

    @Override // X.C6BL
    public final C156426By LJIIIZ(Context context) {
        o.LJIIIZ(context, "context");
        C1557269g c1557269g = new C1557269g(context);
        c1557269g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c1557269g.setController(this);
        c1557269g.setLockMode(true);
        return c1557269g;
    }

    @Override // X.C6BL
    public final void LJJIFFI(InteractStickerStruct interactStickerStruct) {
        C156426By c156426By = this.LJLL;
        if (c156426By != null) {
            c156426By.postDelayed(new ARunnableS21S0200000_2(interactStickerStruct, this, 60), 300L);
        }
    }

    @Override // X.C6BL
    public final boolean LJJIII(C156426By c156426By) {
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        if (c156426By instanceof C1557269g) {
            VideoPublishEditModel videoPublishEditModel = this.LLIIII;
            if (videoPublishEditModel != null && (infoStickerModel = videoPublishEditModel.infoStickerModel) != null && (list = infoStickerModel.stickers) != null) {
                Iterator<StickerItemModel> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().type == 7) {
                        it.remove();
                    }
                }
            }
            this.LLI = null;
            return super.LJJIII(c156426By);
        }
        return false;
    }

    @Override // X.C6BL
    public final void LJJIJ(String str) {
        if (!C38354F3m.LJ(str)) {
            o.LJI(str);
            if (s.LJJJLZIJ(str, "pi_start", false) && s.LJJJLZIJ(str, "pi_end", false)) {
                this.LJLLLL = new OJD("pi_start(.*?)pi_end").replace(str, LJJIL());
                return;
            }
            String separator = File.separator;
            o.LJIIIIZZ(separator, "separator");
            if (ujb.o.LJJJJ(str, separator, false)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(LJJIL());
                this.LJLLLL = X1D.LIZIZ(LIZ);
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(LJJIL());
            this.LJLLLL = X1D.LIZIZ(LIZ2);
        }
    }

    @Override // X.C6BL
    public final void LJIJ(Context context, FrameLayout frameLayout) {
        super.LJIJ(context, frameLayout);
        this.LLFF = false;
    }

    public final void LJJIZ(C67E c67e, boolean z, boolean z2) {
        C6J6 c6j6;
        C1557269g c1557269g;
        C6J6 c6j62 = c67e.LJLIL;
        if ((c6j62 == null || c6j62.getAddTime() == null) && (c6j6 = c67e.LJLIL) != null) {
            c6j6.setAddTime(String.valueOf(SystemClock.elapsedRealtime()));
        }
        this.LLI = c67e;
        LIZLLL(z2);
        C156426By c156426By = this.LJLL;
        if ((c156426By instanceof C1557269g) && (c1557269g = (C1557269g) c156426By) != null) {
            c1557269g.setVisibility(4);
            c1557269g.LLIIIZ.setDonationStickerData(c67e);
            if (z) {
                c1557269g.post(new ARunnableS38S0100000_2(c1557269g, 164));
            }
        }
        C6BO c6bo = this.LJLLILLLL;
        if (c6bo != null) {
            c6bo.LJII();
        }
    }
}
