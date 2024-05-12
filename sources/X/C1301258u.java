package X;

import android.content.Context;
import android.graphics.Canvas;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.track.TrackPanelActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.58u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1301258u extends AbstractC1301158t {
    public final C58D LJIIJ;
    public final ArrayList<C1280750x> LJIIJJI;
    public final String LJIIL;
    public C5AI LJIILIIL;
    public final C1301358v LJIILJJIL;
    public final C1301458w LJIILL;
    public final C1301658y LJIILLIIL;
    public final C1301558x LJIIZILJ;
    public final C1302459g LJIJ;
    public final List<Long> LJIJI;

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final void onScrollChanged() {
        this.LJIILJJIL.onScrollChanged();
        this.LJIJ.getClass();
        this.LJIILL.getClass();
    }

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final void LIZLLL() {
        super.LIZLLL();
        if (C1291054w.LJ().LJJJLIIL) {
            this.LJIIJ.showDraggingMask();
        }
    }

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final boolean LJ() {
        return C1291054w.LJ().LJJJJ;
    }

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final boolean LJIIIZ() {
        return C1291054w.LJ().LJJJIL;
    }

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final void LJII(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJIILJJIL.getClass();
        this.LJIJ.LJII(canvas);
        this.LJIILL.getClass();
    }

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final int LJIIIIZZ(int i) {
        return this.LJIJ.LJIIIIZZ(i);
    }

    public final AbstractC1301158t LJIIZILJ(int i) {
        if (i >= 0) {
            Iterator<C1280750x> it = this.LJIIJJI.iterator();
            while (it.hasNext()) {
                C1280750x next = it.next();
                if (next.LIZ == i) {
                    int i2 = C122554rT.LIZ[next.LIZJ.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        return this.LJIIZILJ;
                                    }
                                } else {
                                    return this.LJIILLIIL;
                                }
                            } else {
                                return this.LJIILL;
                            }
                        } else {
                            return this.LJIJ;
                        }
                    } else {
                        return this.LJIILJJIL;
                    }
                }
            }
        }
        return this.LJIILL;
    }

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final void onMoveFail(NLETrackSlot nLETrackSlot) {
        if (C1291054w.LJ().LJJJLIIL) {
            this.LJIIJ.hideDraggingMask();
        }
        TrackPanelActionListener trackPanelActionListener = this.LJIIJ.getTrackPanelActionListener();
        if (trackPanelActionListener != null) {
            trackPanelActionListener.onMoveFail(nLETrackSlot);
        }
    }

    @Override // X.InterfaceC1304259y
    public final C5A5 LIZJ(int i, C1303859u parent) {
        o.LJIIIZ(parent, "parent");
        return LJIIZILJ(i).LIZJ(i, parent);
    }

    @Override // X.AbstractC1301158t
    public final void LJIIJJI(C5A5 holder, NLETrackSlot slot, int i) {
        C5B4 c5b4;
        C5AI c5ai;
        C5B4 c5b42;
        C5AI c5ai2;
        AnonymousClass594 anonymousClass594;
        C5AI c5ai3;
        C5B4 c5b43;
        C5AI c5ai4;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(slot, "slot");
        AbstractC1301158t LJIIZILJ = LJIIZILJ(i);
        if (LJIIZILJ instanceof C1302459g) {
            if ((holder instanceof C130675Ax) && (c5b43 = (C5B4) holder) != null && (c5ai4 = this.LJIILIIL) != null) {
                ((C130545Ak) c5b43.LIZ()).setLabelPainter$editor_trackpanel_release(c5ai4);
            }
        } else if (LJIIZILJ instanceof C1301358v) {
            if ((holder instanceof AnonymousClass594) && (anonymousClass594 = (AnonymousClass594) holder) != null && (c5ai3 = this.LJIILIIL) != null) {
                anonymousClass594.LJLJJL.setLabelPainter$editor_trackpanel_release(c5ai3);
            }
        } else if (LJIIZILJ instanceof C1301458w) {
            if ((holder instanceof AnonymousClass593) && (c5b42 = (C5B4) holder) != null && (c5ai2 = this.LJIILIIL) != null) {
                ((C130525Ai) c5b42.LIZ()).setLabelPainter$editor_trackpanel_release(c5ai2);
            }
        } else if ((LJIIZILJ instanceof C1301658y) && (holder instanceof AnonymousClass595) && (c5b4 = (C5B4) holder) != null && (c5ai = this.LJIILIIL) != null) {
            ((C130555Al) c5b4.LIZ()).setLabelPainter$editor_trackpanel_release(c5ai);
        }
        LJIIZILJ.LJIIJJI(holder, slot, i);
    }

    @Override // X.InterfaceC1304259y
    public final void LIZ(long j, NLETrackSlot nLETrackSlot, long j2, long j3) {
        C59B trackGroupActionListener = this.LIZ.getTrackGroupActionListener();
        if (trackGroupActionListener != null) {
            trackGroupActionListener.LIZ(j, nLETrackSlot, j2, j3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.58y] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.58x] */
    public C1301258u(final C29S activity, C58D trackPanel, final C1303859u c1303859u, final C1303959v c1303959v, final C1299358b c1299358b, final C58R c58r) {
        super(c1303859u, c1303959v, c1299358b, c58r);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(trackPanel, "trackPanel");
        this.LJIIJ = trackPanel;
        this.LJIIJJI = new ArrayList<>();
        this.LJIIL = "MultiTrackAdapter";
        this.LJIILJJIL = new C1301358v(activity, c1303859u, c1303959v, c1299358b, c58r);
        this.LJIILL = new C1301458w(activity, c1303859u, c1303959v, c1299358b, c58r);
        this.LJIILLIIL = new AbstractC1301158t(activity, c1303859u, c1303959v, c1299358b, c58r) { // from class: X.58y
            public final C29S LJIIJ;

            @Override // X.AbstractC1301158t, X.InterfaceC1304259y
            public final boolean LJ() {
                return false;
            }

            @Override // X.InterfaceC1304259y
            public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
            }

            @Override // X.InterfaceC1304259y
            public final C5A5 LIZJ(int i, C1303859u parent) {
                o.LJIIIZ(parent, "parent");
                return new C5B4<C130555Al>(this.LJIIJ) { // from class: X.595
                    public final C130555Al LJLJJI;

                    @Override // X.C5B4
                    public final /* bridge */ /* synthetic */ C130555Al LIZ() {
                        return this.LJLJJI;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(activity);
                        o.LJIIIZ(activity, "activity");
                        this.LJLJJI = new C130555Al(activity);
                    }
                };
            }

            @Override // X.InterfaceC1304259y
            public final void LIZ(long j, NLETrackSlot nLETrackSlot, long j2, long j3) {
                C59B trackGroupActionListener = this.LIZ.getTrackGroupActionListener();
                if (trackGroupActionListener != null) {
                    trackGroupActionListener.LIZ(j, nLETrackSlot, j2, j3);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c1303859u, c1303959v, c1299358b, c58r);
                o.LJIIIZ(activity, "activity");
                this.LJIIJ = activity;
            }
        };
        this.LJIIZILJ = new AbstractC1301158t(activity, c1303859u, c1303959v, c1299358b, c58r) { // from class: X.58x
            @Override // X.InterfaceC1304259y
            public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
            }

            @Override // X.InterfaceC1304259y
            public final C5A5 LIZJ(int i, C1303859u parent) {
                o.LJIIIZ(parent, "parent");
                final Context context = parent.getContext();
                o.LJIIIIZZ(context, "parent.context");
                return new C5B4<C130565Am>(context) { // from class: X.596
                    public final C130565Am LJLJJI;

                    @Override // X.C5B4
                    public final /* bridge */ /* synthetic */ C130565Am LIZ() {
                        return this.LJLJJI;
                    }

                    {
                        super(context);
                        this.LJLJJI = new C130565Am(context);
                    }
                };
            }

            @Override // X.InterfaceC1304259y
            public final void LIZ(long j, NLETrackSlot nLETrackSlot, long j2, long j3) {
                C59B trackGroupActionListener = this.LIZ.getTrackGroupActionListener();
                if (trackGroupActionListener != null) {
                    trackGroupActionListener.LIZ(j, nLETrackSlot, j2, j3);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c1303859u, c1303959v, c1299358b, c58r);
                o.LJIIIZ(activity, "activity");
            }
        };
        this.LJIJ = new C1302459g(activity, c1303859u, c1303959v, c1299358b, c58r);
        this.LJIJI = new ArrayList();
    }

    @Override // X.InterfaceC1304259y
    public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
        String str = this.LJIIL;
        StringBuilder LIZJ = C06460Ne.LIZJ("onMove from ", i, " to index ", i2, "  offsetTime ");
        LIZJ.append(j);
        C0MT.LIZLLL(LIZJ, " currentTime ", j2, " \n ");
        LIZJ.append(nLETrackSlot);
        C131935Ft.LIZIZ(str, X1D.LIZIZ(LIZJ));
        if (C1291054w.LJ().LJJJLIIL) {
            this.LJIIJ.hideDraggingMask();
        }
        TrackPanelActionListener trackPanelActionListener = this.LJIIJ.getTrackPanelActionListener();
        if (trackPanelActionListener != null) {
            long j4 = 1000;
            trackPanelActionListener.onMove(i, i2, nLETrackSlot, j * j4, j2 * j4, j4 * j3, z);
        }
    }
}
