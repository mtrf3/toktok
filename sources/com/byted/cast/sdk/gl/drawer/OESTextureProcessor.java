package com.byted.cast.sdk.gl.drawer;

/* loaded from: classes29.dex */
public class OESTextureProcessor extends TextureProcessor {
    @Override // com.byted.cast.sdk.gl.drawer.TextureDrawer
    public int getTextureTarget() {
        return 36197;
    }

    @Override // com.byted.cast.sdk.gl.drawer.TextureDrawer
    public String[] getShaderSources() {
        return new String[]{"attribute vec2 a_pos;\nattribute vec2 a_tex;\nvarying vec2 v_tex_coord;\nuniform mat4 u_mvp;\nuniform mat4 u_tex_trans;\nvoid main() {\n   gl_Position = u_mvp * vec4(a_pos, 0.0, 1.0);\n   v_tex_coord = (u_tex_trans * vec4(a_tex, 0.0, 1.0)).st;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES u_tex;\nvarying vec2 v_tex_coord;\nvoid main() {\n  gl_FragColor = texture2D(u_tex, v_tex_coord);\n}\n"};
    }

    public OESTextureProcessor(String str) {
        super(str);
    }
}
