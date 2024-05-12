package com.bytedance.realx.video;

import com.bytedance.realx.video.GlGenericDrawer;

/* loaded from: classes33.dex */
public class GlRectDrawer extends GlGenericDrawer {
    public GlRectDrawer() {
        super("void main() {\n  gl_FragColor = sample(tc);\n}\n", new ShaderCallbacks());
    }

    /* loaded from: classes33.dex */
    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        @Override // com.bytedance.realx.video.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
        }

        @Override // com.bytedance.realx.video.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
        }

        public ShaderCallbacks() {
        }
    }
}
