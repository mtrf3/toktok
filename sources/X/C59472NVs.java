package X;

import java.util.List;

/* renamed from: X.NVs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59472NVs extends C59474NVu {
    public final C59297NOz LIZLLL = new C59297NOz("hide_status_bar", false);
    public final C59297NOz LJ = new C59297NOz("hide_nav_bar", false);
    public final C59297NOz LJFF = new C59297NOz("trans_status_bar", false);
    public final C59478NVy LJI;
    public final C59478NVy LJII;
    public final C59478NVy LJIIIIZZ;
    public final C59478NVy LJIIIZ;
    public final C59478NVy LJIIJ;
    public final C59478NVy LJIIJJI;
    public final C59297NOz LJIIL;
    public final C59478NVy LJIILIIL;
    public final C59478NVy LJIILJJIL;
    public final C59478NVy LJIILL;
    public final C59297NOz LJIILLIIL;
    public final C59297NOz LJIIZILJ;
    public final C59297NOz LJIJ;
    public final C59478NVy LJIJI;
    public final C59478NVy LJIJJ;
    public final C59297NOz LJIJJLI;
    public final C59297NOz LJIL;
    public final C59297NOz LJJ;
    public final C59296NOy LJJI;
    public final C59297NOz LJJIFFI;
    public final C59297NOz LJJII;
    public final C59297NOz LJJIII;
    public final C59297NOz LJJIIJ;
    public final C59297NOz LJJIIJZLJL;
    public final C59297NOz LJJIIZ;
    public final C59297NOz LJJIIZI;
    public final C59478NVy LJJIJ;
    public final C59478NVy LJJIJIIJI;
    public final C59297NOz LJJIJIIJIL;
    public final C59297NOz LJJIJIL;
    public final C59297NOz LJJIJL;
    public final NP0 LJJIJLIJ;
    public final C59297NOz LJJIL;
    public final C59478NVy LJJIZ;
    public final C59478NVy LJJJ;
    public final C59297NOz LJJJI;
    public final C59297NOz LJJJIL;
    public final C59297NOz LJJJJ;

    public C59472NVs() {
        C113444cm c113444cm = C60062Nhi.LIZ;
        this.LJI = new C59478NVy("nav_bar_color", c113444cm, new C59439NUl(-2));
        this.LJII = new C59478NVy("status_bar_color", c113444cm, new C59439NUl(-2));
        this.LJIIIIZZ = new C59478NVy("status_font_mode", C60062Nhi.LIZJ, EnumC60063Nhj.AUTO);
        C113444cm c113444cm2 = C73442uS.LJ;
        this.LJIIIZ = new C59478NVy("title", c113444cm2, null);
        this.LJIIJ = new C59478NVy("title_color", c113444cm, new C59439NUl(-2));
        this.LJIIJJI = new C59478NVy("nav_btn_type", C60062Nhi.LIZIZ, EnumC59901Nf7.NONE);
        this.LJIIL = new C59297NOz("show_more_button", false);
        this.LJIILIIL = new C59478NVy("container_bgcolor", c113444cm, new C59439NUl(-2));
        this.LJIILJJIL = new C59478NVy("loading_bgcolor", c113444cm, new C59439NUl(-2));
        this.LJIILL = new C59478NVy("need_out_animation", C60062Nhi.LIZLLL, EnumC60066Nhm.AUTO);
        this.LJIILLIIL = new C59297NOz("show_loading", true);
        this.LJIIZILJ = new C59297NOz("show_error", true);
        this.LJIJ = new C59297NOz("show_keyboard", false);
        this.LJIJI = new C59478NVy("report_bid", c113444cm2, null);
        this.LJIJJ = new C59478NVy("report_pid", c113444cm2, null);
        this.LJIJJLI = new C59297NOz("show_closeall", false);
        this.LJIL = new C59297NOz("is_adjust_pan", false);
        this.LJJ = new C59297NOz("enable_immersion_keyboard_control", true);
        this.LJJI = new C59296NOy("title_bar_style", 0);
        this.LJJIFFI = new C59297NOz("no_hw", false);
        this.LJJII = new C59297NOz("_need_container_id", false);
        this.LJJIII = new C59297NOz("block_back_press", false);
        this.LJJIIJ = new C59297NOz("status_font_dark", true);
        this.LJJIIJZLJL = new C59297NOz("hide_loading", false);
        this.LJJIIZ = new C59297NOz("show_load_dialog", true);
        this.LJJIIZI = new C59297NOz("should_full_screen", false);
        this.LJJIJ = new C59478NVy("bg_color", c113444cm, new C59439NUl(-2));
        this.LJJIJIIJI = new C59478NVy("top_bar_color", c113444cm, new C59439NUl(-2));
        this.LJJIJIIJIL = new C59297NOz("need_bottom_out", false);
        this.LJJIJIL = new C59297NOz("status_bar_padding", false);
        this.LJJIJL = new C59297NOz("enable_xschema_interceptor", false);
        this.LJJIJLIJ = new NP0("load_url_delay_time", 0L);
        this.LJJIL = new C59297NOz("use_ordinary_web", true);
        this.LJJIZ = new C59478NVy("topbar_type", c113444cm2, null);
        this.LJJJ = new C59478NVy("disable_pop_gesture", c113444cm2, null);
        this.LJJJI = new C59297NOz("hide_more", true);
        this.LJJJIL = new C59297NOz("show_debug_title", false);
        this.LJJJJ = new C59297NOz("copy_link_action", false);
    }

    @Override // X.C59474NVu, X.AbstractC59475NVv
    public List<InterfaceC59479NVz<?>> LIZ() {
        return ORZ.LLIIIZ(C47261Igj.LJJIJIIJI(this.LJJIFFI, this.LJIILJJIL, this.LIZLLL, this.LJFF, this.LJII, this.LJ, this.LJJJIL, this.LJIILIIL, this.LJIIIZ, this.LJJI, this.LJI, this.LJIIJ, this.LJIJJLI, this.LJIL, this.LJJ, this.LJJJ, this.LJJJI, this.LJIIJJI, this.LJIIL, this.LJJIL, this.LJJIZ, this.LJJII, this.LJIJI, this.LJIJJ, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIIIIZZ, this.LJIILL, this.LJJIII, this.LJJIJIL, this.LJJJJ, this.LJJIIJ, this.LJJIJIIJIL, this.LJJIIZI, this.LJJIIJZLJL, this.LJJIJ, this.LJJIIZ, this.LJJIJIIJI, this.LJJIJL, this.LJJIJLIJ), super.LIZ());
    }
}
