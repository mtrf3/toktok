package X;

import Y.ACListenerS29S0300000_3;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8q3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223598q3 extends AbstractC224038ql {
    public final Aweme LJLLI;
    public final C221848nE LJLLILLLL;
    public final View LJLLJ;

    @Override // X.AbstractC224038ql, X.Y1E
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.AbstractC224038ql
    public final void LJIJI() {
    }

    @Override // X.AbstractC224038ql
    public final void LJIJJ() {
    }

    @Override // X.Y1I
    public final void LJJII() {
    }

    @Override // X.Y1E
    public final int getStickerType() {
        return 19;
    }

    @Override // X.AbstractC224038ql
    public final View LJIILLIIL() {
        return new View(this.LJLILLLLZI);
    }

    @Override // X.Y1I
    public final void LJJIIZ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LJLJL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    @Override // X.Y1I
    public final View LIZ(int i) {
        return this.LJLLJ;
    }

    @Override // X.AbstractC224038ql, X.Y1P
    public final void LJII(C245649kW interactStickerParams) {
        o.LJIIIZ(interactStickerParams, "interactStickerParams");
        this.LJLJJI = interactStickerParams;
        C221848nE c221848nE = this.LJLLILLLL;
        c221848nE.getClass();
        c221848nE.LJLJJI = interactStickerParams;
    }

    @Override // X.AbstractC224038ql
    public final int LJIIZILJ(C6DL c6dl) {
        VideoShareInfoStruct videoShareInfoStruct;
        o.LJIIIZ(c6dl, "<this>");
        InteractStickerStruct interactStickerStruct = this.LJLJLLL;
        if (interactStickerStruct == null || (videoShareInfoStruct = interactStickerStruct.getVideoShareInfoStruct()) == null) {
            return 0;
        }
        C6DQ c6dq = new C6DQ();
        c6dq.LIZJ = C88913eJ.LIZ(this.LJLLJ, R.string.r6m, "view.context.getString(R…e_to_story_view_original)");
        c6dq.LIZLLL = new ACListenerS29S0300000_3(this, c6dl, videoShareInfoStruct, 15);
        c6dl.LIZ(c6dq);
        LJJ("show", videoShareInfoStruct);
        return 1;
    }

    public final void LJJ(String str, VideoShareInfoStruct videoShareInfoStruct) {
        String str2;
        C223778qL c223778qL;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", str);
        c188727au.LJIIIZ("creator_id", videoShareInfoStruct.getAuthorId());
        c188727au.LJIIIZ("original_group_id", videoShareInfoStruct.getAwemeId());
        C245649kW c245649kW = this.LJLJJI;
        if (c245649kW != null && (c223778qL = c245649kW.LJIIZILJ) != null) {
            str2 = c223778qL.LIZ;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("author_id", this.LJLLI.getAuthorUid());
        c188727au.LJIIIZ("group_id", this.LJLLI.getAid());
        c188727au.LJIIIZ("story_collection_id", C54838Lfe.LJI(this.LJLLI));
        FMX.LJIIL("view_original_post", c188727au.LIZ);
    }

    @Override // X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        if (!this.LJLLI.isSharedStoryVisible()) {
            return false;
        }
        return LJIIJJI(j, f, f2, i);
    }

    @Override // X.Y1P
    public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        InteractStickerStruct interactStickerStruct = this.LJLJLLL;
        if (interactStickerStruct == null || interactStickerStruct.getVideoShareInfoStruct() == null) {
            return false;
        }
        return LJIILIIL(j, i, f, f2, popListener);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8nE] */
    public C223598q3(int i, final Context context, C224048qm c224048qm, final InteractStickerStruct interactStickerStruct, final C245649kW c245649kW, Aweme aweme) {
        super(i, context, c224048qm, interactStickerStruct, c245649kW);
        this.LJLLI = aweme;
        this.LJLLILLLL = new AbstractC221838nD(context, this, interactStickerStruct, c245649kW) { // from class: X.8nE
            public final C223598q3 LJLJJL;

            @Override // X.AbstractC221838nD
            public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct stickerStruct) {
                o.LJIIIZ(stickerStruct, "stickerStruct");
                return C223998qh.LIZIZ(stickerStruct);
            }

            @Override // X.AbstractC221838nD
            public final void LIZJ(float f, float f2, InterfaceC221818nB popListener) {
                o.LJIIIZ(popListener, "popListener");
                this.LJLJJL.LJIL(f, f2);
            }

            {
                o.LJIIIZ(this, "videoShareInteractStickerView");
                this.LJLJJL = this;
            }

            @Override // X.AbstractC221838nD, X.Y1P
            public final boolean LJIIJJI(long j, float f, float f2, int i2) {
                NormalTrackTimeStamp normalTrackTimeStamp;
                RectF rectF;
                List<NormalTrackTimeStamp> LIZIZ = LIZIZ(j, this.LJLJI);
                if (LIZIZ == null) {
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                for (NormalTrackTimeStamp normalTrackTimeStamp2 : LIZIZ) {
                    if (normalTrackTimeStamp2 != null) {
                        C245649kW c245649kW2 = this.LJLJJI;
                        if (c245649kW2 == null) {
                            rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            float f3 = c245649kW2.LIZ;
                            float f4 = c245649kW2.LIZIZ;
                            if (f3 == f4) {
                                rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                float width = normalTrackTimeStamp2.getWidth() * f3;
                                float height = normalTrackTimeStamp2.getHeight() * f4;
                                float f5 = 2;
                                float x = (normalTrackTimeStamp2.getX() * C60996Nwm.LJIIIIZZ(this.LJLIL)) - (width / f5);
                                float y = (normalTrackTimeStamp2.getY() * C60996Nwm.LJ(this.LJLIL)) - (height / f5);
                                rectF = new RectF(x, y, width + x, height + y);
                            }
                        }
                        arrayList.add(rectF);
                    }
                }
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    int i4 = i3 + 1;
                    RectF rectF2 = (RectF) it.next();
                    if (ListProtector.get(LIZIZ, i3) != null && (normalTrackTimeStamp = (NormalTrackTimeStamp) ListProtector.get(LIZIZ, i3)) != null && C79045V0n.LJIIL(f, f2, rectF2, normalTrackTimeStamp.getRotation())) {
                        return true;
                    }
                    i3 = i4;
                }
                return false;
            }
        };
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        this.LJLLJ = view;
    }
}
