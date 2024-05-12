package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.66z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1551366z extends C6BL {
    public final InterfaceC143655kP LLI;
    public CaptionStruct LLIFFJFJJ;
    public C156436Bz LLII;
    public C69M LLIIII;
    public VideoPublishEditModel LLIIIILZ;
    public AnonymousClass672 LLIIIJ;
    public boolean LLIIIL;
    public final C62822Ol8 LLIIIZ;

    @Override // X.C6BL
    public final int LJIIJ() {
        return 0;
    }

    @Override // X.C6BL
    public final int LJIILIIL() {
        return 11;
    }

    @Override // X.InterfaceC156096Ar
    public final InteractStickerStruct getInteractStickerStruct() {
        return null;
    }

    @Override // X.C6BL
    public final C6C0 LJIIIIZZ() {
        return new C6C0() { // from class: X.670
            {
                super(C1551366z.this);
            }

            @Override // X.C6C0, X.C6P6, X.C6V2
            public final boolean LJJIIZI(MotionEvent motionEvent) {
                C1551366z c1551366z = C1551366z.this;
                int i = 0;
                if (!c1551366z.LJLILLLLZI) {
                    return false;
                }
                Iterator it = ((ArrayList) c1551366z.LJLLI).iterator();
                while (true) {
                    String str = null;
                    if (it.hasNext()) {
                        C156426By c156426By = (C156426By) it.next();
                        if (c156426By != null && c156426By.LJIIJJI(motionEvent)) {
                            C1551366z c1551366z2 = C1551366z.this;
                            c1551366z2.LLIIIL = false;
                            C156436Bz c156436Bz = c1551366z2.LLII;
                            if (c156436Bz != null) {
                                C69M c69m = c1551366z2.LLIIII;
                                if (c69m != null) {
                                    InterfaceC153045zY interfaceC153045zY = c1551366z2.LJLJLJ;
                                    if (interfaceC153045zY != null) {
                                        i = interfaceC153045zY.LJZL();
                                    }
                                    str = c69m.LIZ(i);
                                }
                                c156436Bz.setCaption(str);
                            }
                            StickerHintTextViewModel stickerHintTextViewModel = C1551366z.this.LL;
                            if (stickerHintTextViewModel != null) {
                                stickerHintTextViewModel.gv0().postValue(Boolean.TRUE);
                            }
                            return true;
                        }
                    } else {
                        AnonymousClass655 anonymousClass655 = C1551366z.this.LJLJJI;
                        if (anonymousClass655 != null) {
                            anonymousClass655.hide();
                        }
                        Context context = C1551366z.this.LJZL;
                        if (context != null && C45804HyK.LJJIFFI(context) != null) {
                            C1551366z.this.getClass();
                            VideoPublishEditModel videoPublishEditModel = C1551366z.this.LLIIIILZ;
                            if (videoPublishEditModel == null || !videoPublishEditModel.isRetakeVideo()) {
                                C1551366z.this.LLI.U2(true, false, true);
                            }
                        }
                        return false;
                    }
                }
            }

            @Override // X.C6C0, X.C6P6, X.C6V2
            public final boolean onDown(MotionEvent motionEvent) {
                C1551366z c1551366z = C1551366z.this;
                c1551366z.LLD = false;
                if (!c1551366z.LJLILLLLZI) {
                    return false;
                }
                Iterator it = ((ArrayList) c1551366z.LJLLI).iterator();
                while (it.hasNext()) {
                    C156426By c156426By = (C156426By) it.next();
                    if (c156426By != null && c156426By.LJIIJ(motionEvent)) {
                        C1551366z c1551366z2 = C1551366z.this;
                        c1551366z2.LLIIIL = true;
                        c1551366z2.getClass();
                        return true;
                    }
                }
                return false;
            }
        };
    }

    @Override // X.C6BL
    public final boolean LJIILLIIL() {
        if (this.LLIFFJFJJ != null) {
            return true;
        }
        return false;
    }

    public C1551366z(InterfaceC143655kP editPreviewApi) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        this.LLI = editPreviewApi;
        this.LLIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 517));
    }

    @Override // X.C6BL
    public final void LJII(AnonymousClass671 anonymousClass671) {
        if (anonymousClass671 != null) {
            anonymousClass671.getContentView().post(new ARunnableS38S0100000_2(anonymousClass671, 114));
            anonymousClass671.LIZ();
        }
    }

    @Override // X.C6BL
    public final C156426By LJIIIZ(Context context) {
        o.LJI(context);
        C156436Bz c156436Bz = new C156436Bz(context);
        c156436Bz.setLockMode(true);
        c156436Bz.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c156436Bz.setOnCaptionStickerListener(this.LLIIIJ);
        c156436Bz.setPublishEditModel(this.LLIIIILZ);
        this.LLII = c156436Bz;
        return c156436Bz;
    }

    public final void LJJIJLIJ(List<Utterance> list) {
        if (C78886Uxe.LJJIJ(list)) {
            this.LLIFFJFJJ = null;
            InterfaceC153045zY interfaceC153045zY = this.LJLJLJ;
            if (interfaceC153045zY != null) {
                interfaceC153045zY.LLFFF((C1551266y) this.LLIIIZ.getValue());
            }
            this.LLIIII = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        o.LJI(list);
        arrayList.addAll(list);
        CaptionStruct captionStruct = this.LLIFFJFJJ;
        if (captionStruct == null) {
            this.LLIFFJFJJ = new CaptionStruct(null, arrayList, 0, null, null, 0L, null, null, 253, null);
        } else {
            captionStruct.setUtterances(arrayList);
        }
        LIZLLL(false);
        this.LLIIII = new C69M(arrayList);
        InterfaceC153045zY interfaceC153045zY2 = this.LJLJLJ;
        if (interfaceC153045zY2 != null) {
            interfaceC153045zY2.LLJLIL((C1551266y) this.LLIIIZ.getValue());
        }
    }

    @Override // X.C6BL, X.InterfaceC147435qV
    public final boolean Rc(RectF rectF) {
        boolean z;
        List<Utterance> utterances;
        CaptionStruct captionStruct = this.LLIFFJFJJ;
        if (captionStruct == null || (utterances = captionStruct.getUtterances()) == null || utterances.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // X.C6BL
    public final void LJJIJIIJI(InterfaceC153045zY interfaceC153045zY, InterfaceC143655kP interfaceC143655kP) {
        super.LJJIJIIJI(interfaceC153045zY, interfaceC143655kP);
    }
}
